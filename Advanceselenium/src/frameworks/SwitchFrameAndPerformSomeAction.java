package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrameAndPerformSomeAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo.site/frames-and-windows/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='iFrame']]"));
		Thread.sleep(1000);
		WebElement frame_address = driver.findElement(By.xpath("//frame[@class='laryloaded']"));
		driver.switchTo().frame(frame_address);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='s']"));
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.close()
		
		;

	}

}
