package TestCases;

import org.testng.annotations.Test;

import PageObject.LoginPageBetter;

public class Logout  {
	
	//TestLogin lg = new TestLogin();
	      
	@Test
	public void BetterLogou(){
	
	TestBookingMain.driver.close();
		
	System.out.println("driver closed");  
	
	}
	
	
	

}
