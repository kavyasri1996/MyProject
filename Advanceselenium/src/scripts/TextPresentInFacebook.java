package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextPresentInFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement message = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String text = message.getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.quit();

	}

}
