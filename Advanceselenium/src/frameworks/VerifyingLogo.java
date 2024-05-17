package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyingLogo {
	
	@Test
	public void script() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demowebshop.tricentis.com/");
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed());
		Thread.sleep(1000);
		driver.quit();
	}
	

}
