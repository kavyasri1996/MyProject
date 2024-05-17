package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentOnDiabledElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.id("name"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='KAVYA'", name);
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='kavya@gmail.com'",email);
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].value='Kavya@16'",password);
		Thread.sleep(1000);
		driver.quit();
		

	}

}
