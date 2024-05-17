package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='radio'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
