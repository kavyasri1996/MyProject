package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FetchToolTip {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement kannada = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		String tool_tip = kannada.getAttribute("title");
		String link = kannada.getAttribute("href");
		System.out.println(tool_tip);
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		}

}
