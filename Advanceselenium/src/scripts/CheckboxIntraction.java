package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxIntraction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/dummypage1.html");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("Hello");
		Thread.sleep(1000);
		driver.findElement(By.id("a1")).sendKeys("world");
		Thread.sleep(1000);
		driver.findElement(By.className("c1")).click();
		Thread.sleep(1000);
		driver.quit();


	}

}
