package testNGConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	}

}

