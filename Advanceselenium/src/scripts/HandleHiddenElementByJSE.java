package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleHiddenElementByJSE {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		WebElement hidden_element = driver.findElement(By.name("custom_gender"));
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='HelloWorld'", hidden_element);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
