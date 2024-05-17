package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ShaadiLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Kavyasrinivasa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Kavya");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-testid='sign_in']")).click();
		Thread.sleep(1000);
		driver.quit();
		

	}

}
