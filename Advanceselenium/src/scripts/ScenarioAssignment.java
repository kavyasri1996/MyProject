package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
		driver.findElement(By.xpath("//a[text()='Health Book']/../../div[3]/div[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		
		double d = 0;
		
		
		
		List<WebElement> totalproduct = driver.findElements(By.xpath("//span[@class='product-subtotal']"));
		for(WebElement total : totalproduct)
		{
			String count = total.getText();
			double a = Double.parseDouble(count);
			System.out.println(a);
			d=d+a;
		}
		
		WebElement subtotal = driver.findElement(By.xpath("//span[text()='Sub-Total:']/../../td[2]/span/span"));
		String st = subtotal.getText();
		double s = Double.parseDouble(st);
		System.out.println(s);
		
		if(d==s)
		{
			System.out.println("price is same");
		}
		else {
			System.out.println("not same");
		}
		
		driver.quit();
		
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
