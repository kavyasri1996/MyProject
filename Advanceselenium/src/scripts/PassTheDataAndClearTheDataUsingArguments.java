package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PassTheDataAndClearTheDataUsingArguments {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/diabledelement.html");
		Thread.sleep(1000);
		WebElement disabled = driver.findElement(By.id("textfield"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Kavya'", disabled);
		Thread.sleep(1000);
		js.executeScript("arguments[0].value=' ' ", disabled);
		Thread.sleep(1000);
		driver.quit();

	}

}
