package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		WebElement fashion_tab = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions act = new Actions(driver);
		act.moveToElement(fashion_tab).perform();
		Thread.sleep(1000);
		WebElement men_footwear = driver.findElement(By.xpath(""));
		
		
		

	}

}
