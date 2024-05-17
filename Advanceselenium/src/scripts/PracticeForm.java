package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeForm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Kavya");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Srinivasa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("kavyasrinivas@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7975334912");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).click();
		Thread.sleep(1000);
	    //driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("Advance Selenium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).
		sendKeys("#5, 4th F Cross, Maruthinagar, Kamakshipalya, Bangalore");
		Thread.sleep(1000);
		driver.quit();
		

	}

}
