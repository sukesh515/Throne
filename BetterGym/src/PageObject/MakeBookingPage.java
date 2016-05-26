package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class MakeBookingPage {

	
	WebDriver driver;

	
	public MakeBookingPage (WebDriver driver) {
				
		this.driver = driver;	
	}
	
	By makebook = By.linkText("Make a Booking");

	By avoneilcheckbox = By.xpath(".//*[@id='contentWrapper']/div[2]/div/div[2]/div[1]/form/div[3]/label/input");
	
	By otheractivities = By.xpath(".//*[@id='behaviours']/div[2]/label");
	
	By badmintoncheckbox = By.xpath(".//*[@id='activities']/div[1]/label");
	
	By bookingsubmit = By.xpath(".//*[@id='bottomsubmit']");
	
	
	
public WebElement MakeBooking() {
		
		
		return driver.findElement(makebook);
		
		
	}
	

public WebElement AvoneilCheckbox () {
	
	
	return driver.findElement(avoneilcheckbox);
	
	
}
	
public WebElement OtherActivities () {
	
	
	return driver.findElement(otheractivities);
	
	
}
	
public WebElement badmintoncheckbox () {
	
	
	return driver.findElement(badmintoncheckbox);
	
	
}
	
public WebElement bookingsubmit () {
	
	
	return driver.findElement(bookingsubmit);
	
	
}
	
}
