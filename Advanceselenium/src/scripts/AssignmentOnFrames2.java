package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentOnFrames2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(1000);
		WebElement frm = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frm);
		WebElement text = driver.findElement(By.id("sampleHeading"));
		String t = text.getText();
		System.out.println(t);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement frm1 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frm1);
		WebElement text1 = driver.findElement(By.id("sampleHeading"));
		String t1 = text1.getText();
		System.out.println(t1);
		driver.quit();

	}

}
