package testng;

import org.testng.annotations.Test;

public class CarLoan {
		@Test(groups={"smoke","regress" })
		public void newCarLoan()
		{
			System.out.println("for car bike");
		}
		
		@Test(groups= {"regress"})
		public void oldCarLoan()
		{
			System.out.println("for car bikes");
		}

}
