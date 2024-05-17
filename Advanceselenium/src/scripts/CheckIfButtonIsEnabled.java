package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIfButtonIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/button");
		Thread.sleep(1000);
		WebElement yes_button = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		if(yes_button.isEnabled())
		{
			yes_button.click();
		}
		else
		{
			System.out.println("Not Enabled");
		}
		Thread.sleep(1000);
		driver.quit();
		
}
}
