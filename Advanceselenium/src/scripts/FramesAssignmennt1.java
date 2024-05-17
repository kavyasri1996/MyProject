package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesAssignmennt1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		Thread.sleep(1000);
		driver.findElement(By.id("iFrame")).click();
		Thread.sleep(3000);
		WebElement frm = driver.findElement(By.name("globalSqa"));
		driver.switchTo().frame(frm);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("kavya");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.close();

	}

}
