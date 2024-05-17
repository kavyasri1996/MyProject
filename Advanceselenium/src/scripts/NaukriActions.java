package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
