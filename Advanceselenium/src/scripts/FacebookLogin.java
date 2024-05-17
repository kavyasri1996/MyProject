package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("kavyasrinivasa1996@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("Kavya@1996");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
