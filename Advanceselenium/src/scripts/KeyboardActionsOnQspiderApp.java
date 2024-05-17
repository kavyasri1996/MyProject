package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyboardActionsOnQspiderApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/keyboard");
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("kavyasrinivasa@gmail.com",Keys.TAB,"kavya@1996",Keys.TAB,"kavya@1996",Keys.TAB,Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();

	}

}
