package practice.OrgTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOrganizationWithPhoneNum {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\commondata.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		
		String BROWSER = pObj.getProperty("browser");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");
		
		Random ran = new Random();
		int ranint = ran.nextInt(100);
		
		
		FileInputStream fis1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\New folder\\TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet("org");
		Row row = sh.getRow(7);
		String orgName = row.getCell(2).toString()+ranint;
		String phonenumber = row.getCell(3).getStringCellValue();
		wb.close();
	
		
		
		WebDriver driver = null;
		
		if(BROWSER.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (BROWSER.equals("firefoxe"))
		{
			driver = new FirefoxDriver();
		}
		else if (BROWSER.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		
		
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		
		driver.findElement(By.id("phone")).sendKeys(phonenumber);
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		//verify header phone num info and expected result
				String actphonenumber = driver.findElement(By.id("dtlview_Phone")).getText();
				if(actphonenumber.contains(phonenumber))
				{
					System.out.println(phonenumber+ "info is created==pass");
				}
				else {
					System.out.println(phonenumber+ "info is notcreated==fail");
				}
				
				
				
		driver.quit();

	}

}
