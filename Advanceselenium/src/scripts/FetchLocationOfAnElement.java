package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchLocationOfAnElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement can = driver.findElement(By.linkText("Canada"));
		Point loc = can.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(x+"    "+y);
		System.out.println(loc);
		Thread.sleep(1000);
		driver.quit();

	}

}
