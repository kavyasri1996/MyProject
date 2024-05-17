package testngdec_ini_uti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class_fb {
	
	//stage1
	@FindBy(id="email")
	private WebElement un_txt;
	@FindBy(id="pass")
	private WebElement pass_txt;
	@FindBy(id="login")
	private WebElement lgn_txt;
	
	
	//stage2
	public Pom_class_fb(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//stage3
	public WebElement enter_un()
	{
		return un_txt;
	}
	public WebElement enter_pass()
	{
		return pass_txt;
	}
	public WebElement login_click()
	{
		return lgn_txt;
	}

}
