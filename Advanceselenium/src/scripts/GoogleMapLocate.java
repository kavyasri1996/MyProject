package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapLocate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@12.979865,77.5504666,15z?authuser=0&entry=ttu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Rajajinagar");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']/../../../button[1]")).click(;
		
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Marathahalli");
		Thread.sleep(1000);
		
		
		//driver.findElement(By.xpath("//span[text()='Details']")).click();
		//Thread.sleep(3000);
		driver.quit();
		
	}

}
