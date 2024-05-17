package scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnTakeScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel')])[1]")).click();
		Thread.sleep(1000);
		WebElement dropdown = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Name: A to Z");
		Thread.sleep(1000);
		WebElement dropdown1 = driver.findElement(By.id("products-pagesize"));
		Select sel1 = new Select(dropdown1);
		sel1.selectByVisibleText("4");
		Thread.sleep(1000);
		WebElement dropdown2 = driver.findElement(By.id("products-viewmode"));
		Select sel2 = new Select(dropdown2);
		sel2.selectByVisibleText("List");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		WebElement confirmmsg = driver.findElement(By.xpath("//a[contains(text(),'Polka Dot')]"));
		if(confirmmsg.isDisplayed())
		{
			System.out.println("added");
		}
		else {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File tem_mem = ts.getScreenshotAs(OutputType.FILE);
			File perm_mem = new File("C:\\Users\\Lenovo\\Desktop\\defect screenshots\\demoshop.jpeg");
			FileHandler.copy(tem_mem, perm_mem);
		}
		Thread.sleep(1000);
		driver.quit();

	}

}
