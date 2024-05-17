package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartAmazonAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 14");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).submit();
		Thread.sleep(3000);
		WebElement message=driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]"));
		String text=message.getText();
		System.out.println(text);
		driver.quit();
		
	}

}
