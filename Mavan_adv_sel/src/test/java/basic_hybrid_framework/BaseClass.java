package basic_hybrid_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
private static final String Chrome_key = null;
private static final String Chrome_value = null;
public WebDriver driver;
	
	@BeforeMethod
	public void OpenApp()
	{
		System.setProperty(Chrome_key, Chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String base_url = null;
		driver.get(base_url);
		
	}
	
	@AfterMethod
	public void CloseApp()
	{
		driver.close();
	}
}
