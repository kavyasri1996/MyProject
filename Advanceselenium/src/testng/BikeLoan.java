package testng;

import org.testng.annotations.Test;

public class BikeLoan {
	@Test(groups={"smoke","regress" })
	public void newBikeLoan()
	{
		System.out.println("for new bike");
	}
	
	@Test(groups= {"regress"})
	public void oldBikeLoan()
	{
		System.out.println("for old bikes");
	}
	

}
