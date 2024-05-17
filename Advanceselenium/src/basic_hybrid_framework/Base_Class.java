package basic_hybrid_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class implements Framework_Constants{
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenApp()
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
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
