package scripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopupHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(1000);
		driver

}
