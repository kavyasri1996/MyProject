package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentOnFrames3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		WebElement frm = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frm);
		WebElement text = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		String t = text.getText();
		System.out.println(t);
		WebElement frm1 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(frm1);
		WebElement text1 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		String t1 = text1.getText();
		System.out.println(t1);
		driver.quit();
		

	}

}
