package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FetchTitle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();

	}

}
