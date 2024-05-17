package reports_gen;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extent_script {
	@Test
	public void sample() throws IOException 
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/extent_report.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(reporter);
		
		ExtentTest test = reports.createTest("testcase for extent report").assignAuthor("Kavya");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(Status.INFO,"browser is launched");
		driver.get("https://www.zomato.com/india");
		test.log(Status.INFO, "the url of zomato is launched");
		String title = driver.getTitle();
		if(title.equals("Restarants in India"))
		{
			test.log(Status.PASS, "testcase is pass");
		}
		else
		{
			test.log(Status.FAIL, "testcase failed");
			test.addScreenCaptureFromPath(getphoto(driver));
		}
		reports.flush();
	}
	
	public String getphoto(WebDriver driver) throws IOException
	{
		String path = "./photo/defect.jpg";
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File(path);
		FileHandler.copy(src, dst);
		return "."+path;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
