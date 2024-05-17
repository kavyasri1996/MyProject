package testng_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements Frameworkconstant {
	public WebDriver driver;
	
	@BeforeMethod 
	public void OpenApp()
	{
		System.setProperty(gecko_key, gecko_value);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(base_url);	
	}
	
	@AfterMethod
	public void CloseApp()
	{
		driver.close();
	}

}
