package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PassDataToDiabledTextAndClear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/diabledelement.html");
		Thread.sleep(1000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('textfield').value='Kavya'");
		Thread.sleep(1000);
		js.executeScript("document.getElementById('textfield').value=' '");
		Thread.sleep(1000);
		driver.quit();
		

	}

}
