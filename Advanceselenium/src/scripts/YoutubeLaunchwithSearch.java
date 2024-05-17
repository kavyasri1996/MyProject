package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeLaunchwithSearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(1000);
		driver.findElement(By.name("search_query")).sendKeys("kushi trailer");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Kushi Official Trailer | Vijay Deverakonda, Samantha | Netflix India")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
