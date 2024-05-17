package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/dummypage1.html");
		Thread.sleep(1000);
		WebElement text1=driver.findElement(By.tagName("input"));
		text1.sendKeys("HELLO");
		Thread.sleep(1000);
		text1.clear();
		Thread.sleep(1000);
		WebElement text2=driver.findElement(By.id("a1"));
		text2.sendKeys("WORLD");
		Thread.sleep(1000);
		text2.clear();
		WebElement cbox=driver.findElement(By.className("c1"));
		cbox.click();
		Thread.sleep(1000);
		cbox.click();
		Thread.sleep(1000);
		WebElement radbut=driver.findElement(By.name("n1"));
		radbut.click();
		Thread.sleep(1000);
		radbut.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
