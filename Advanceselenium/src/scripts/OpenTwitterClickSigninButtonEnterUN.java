package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenTwitterClickSigninButtonEnterUN {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.twitter.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("Kavya Srinivasa");
		Thread.sleep(3000);
		driver.quit();
	}

}
