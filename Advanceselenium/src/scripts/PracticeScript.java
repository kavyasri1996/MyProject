package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='gender-female']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("KAVYA");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("SRINIVASA");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("kavyasr1@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Kavya@1996");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Kavya@1996");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("kavyasr1@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Kavya@1996");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
