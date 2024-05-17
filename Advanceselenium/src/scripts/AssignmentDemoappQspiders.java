package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDemoappQspiders {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'With ToolTip')]")).click();
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.id("name"));
		String tool_tip = text.getAttribute("title");
		System.out.println(tool_tip);
		driver.quit();

	}

}
