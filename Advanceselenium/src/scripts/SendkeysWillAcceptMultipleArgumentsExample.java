package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendkeysWillAcceptMultipleArgumentsExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("kavyasrinivasa",Keys.TAB,"kavya@1996",Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		

}
}
