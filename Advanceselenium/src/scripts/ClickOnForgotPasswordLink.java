package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnForgotPasswordLink {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(1000);
		driver.quit();
		

	}

}
