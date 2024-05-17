package basic_hybrid_framework;

import org.testng.annotations.Test;


public class Runner_Class extends Base_Class {
	@Test
	public void run() throws InterruptedException
	{
		POM_Class p = new POM_Class(driver);
		p.enter_un().sendKeys("Kavya");
		Thread.sleep(2000);
		p.enter_pass().sendKeys("Kavya123");
		Thread.sleep(2000);	
		p.login_click().click();
		Thread.sleep(2000);
	}
}


