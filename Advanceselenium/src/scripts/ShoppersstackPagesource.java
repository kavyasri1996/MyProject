package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ShoppersstackPagesource {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://www.shoppersstack.com");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		String src_code = driver.getPageSource();
		Thread.sleep(2000);
		if(src_code.contains("Login"))
		{
			System.out.println("it is present");
		}
		else
		{
			System.out.println("not present");
		}
		driver.quit();

	}

}
