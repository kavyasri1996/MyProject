package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formfilling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("KAVYA S");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("kavyasrinivasa1996@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("Bangalore Karnataka");
		Thread.sleep(1000);
		driver.findElement(By.id("permanentAddress")).sendKeys("Bangalore Karnataka");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
