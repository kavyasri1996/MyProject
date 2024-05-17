package testngdec_ini_uti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runner {

	@Test
	public void run() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Pom_class_fb p = new Pom_class_fb(driver);
		p.enter_un().sendKeys("Kavya");
		Thread.sleep(2000);
		p.enter_pass().sendKeys("Kavya123");
		Thread.sleep(2000);	
		p.login_click().click();
	}
}
