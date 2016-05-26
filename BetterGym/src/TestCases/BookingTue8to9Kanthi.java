package TestCases;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import PageObject.BookingCompletionPage;
import PageObject.LoginPageBetter;
import PageObject.MakeBookingPage;
import PageObject.SlotsAvailabilityFrame;


public class BookingTue8to9Kanthi {
	
	static WebDriver driver;
	
	@Test
	
	public void LoginBet() throws InterruptedException, IOException {
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukeshswathi\\Documents\\TarunSelenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver()*/;

		WebDriver driver = new FirefoxDriver();
        LoginPageBetter lp = new LoginPageBetter(driver);
	
		
		Properties prop = new Properties();
		
		FileInputStream fil = new FileInputStream(System.getProperty("user.dir")+ "\\src\\datadriven.properties");
		
		//FileInputStream fil = new FileInputStream("datadriven.properties");
		
		
		prop.load(fil);

		driver.get("https://better.legendonlineservices.co.uk/enterprise/account/login");
		
		driver.manage().window().maximize();
		
		lp.username().sendKeys(prop.getProperty("usernameka"));
		lp.Password().sendKeys(prop.getProperty("passwordka"));
		
		lp.Login().click();
        
		Thread.sleep(3340L);
		
	
	    MakeBookingPage  makeb = new MakeBookingPage(driver);
		
		makeb.MakeBooking().click();
		
		makeb.AvoneilCheckbox().click();
				
		makeb.AvoneilCheckbox().click();
		
		Thread.sleep(3220l);
		
		makeb.OtherActivities().click();
		
		Thread.sleep(3220l);
		
		makeb.badmintoncheckbox().click();
		
		Thread.sleep(3220l);
		makeb.bookingsubmit().click();
		
		SlotsAvailabilityFrame  sa = new SlotsAvailabilityFrame(driver);
		
		sa.SwitchtoFrame();
		
		driver.findElement(By.xpath(prop.getProperty("Tue8to9"))).click();
		
				
		sa.SwitchtoFrame();
		sa.AddingtoBasket().click();
		Thread.sleep(3220l);
		
		driver.navigate().refresh();
		
		BookingCompletionPage bc = new BookingCompletionPage(driver);
		
		// This is to click the Basket after refresh
		
		driver.findElement(By.xpath(".//*[@id='submenu']/ul/li[12]/a")).click();
		
		  bc.UsingVoucher().click();
		  bc.BookingComplete().click();
		  bc.ContiuetoHomePage().click();
		  
		  driver.close();
		  		

		
}


}