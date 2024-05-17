package testNGConcept;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner extends BaseClass
{
	@Test
	public void run() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("kavya@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("kavya");
		Thread.sleep(1000);
	}

}
