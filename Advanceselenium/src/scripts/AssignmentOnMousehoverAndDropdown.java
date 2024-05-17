package scripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentOnMousehoverAndDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
	}

}
