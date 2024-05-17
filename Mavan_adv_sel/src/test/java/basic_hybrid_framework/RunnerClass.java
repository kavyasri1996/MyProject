
package basic_hybrid_framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RunnerClass {
	@Test
	public void run() throws InterruptedException
	{
		WebDriver driver = null;
		POMClass p = new POMClass(driver);
		p.enter_un().sendKeys("Kavya");
		Thread.sleep(2000);
		p.enter_pass().sendKeys("Kavya123");
		Thread.sleep(2000);	
		p.login_click().click();
		Thread.sleep(2000);
	}
}
