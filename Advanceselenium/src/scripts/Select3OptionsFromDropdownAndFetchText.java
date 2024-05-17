package scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select3OptionsFromDropdownAndFetchText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		
		WebElement dropdowns=driver.findElement(By.id("day"));
		Select sel=new Select(dropdowns);
		sel.selectByValue("16");
		Thread.sleep(1000);
		
		WebElement dropdowns1=driver.findElement(By.id("month"));
		Select sel1=new Select(dropdowns1);
		sel1.selectByValue("6");
		Thread.sleep(1000);
		
		WebElement dropdowns2=driver.findElement(By.id("year"));
		Select sel2=new Select(dropdowns2);
		sel2.selectByValue("1996");
		Thread.sleep(1000);
		
		driver.quit();
		

	}

}
