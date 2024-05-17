package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("kavyasr1@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Kavya@1996");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../../div[3]/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Fiction']/../../div[3]/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='product-name']/../../../tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='product-name']/../../../tr[2]/td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-2 update-cart-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
