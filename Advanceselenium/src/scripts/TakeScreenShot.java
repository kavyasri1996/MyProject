package scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File tem_mem = ts.getScreenshotAs(OutputType.FILE);
		File perm_mem = new File("C:\\Users\\Lenovo\\Desktop\\defect screenshots\\Facebook.jpeg");
		FileHandler.copy(tem_mem, perm_mem);
		driver.quit();
		

	}
	

}
