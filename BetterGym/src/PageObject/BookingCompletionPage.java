package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingCompletionPage {
	
	
WebDriver driver;

	
	public BookingCompletionPage (WebDriver driver) {
				
		this.driver = driver;	
	}
	
	
	
	By voucher = By.linkText("Use Voucher");
	
	By complete = By.linkText("Complete");
	
	By contiue = By.linkText("Continue");
	
	
public WebElement UsingVoucher() {
		
		
		return driver.findElement(voucher);
		
		
	}
	
	
public WebElement BookingComplete() {
	
	
	return driver.findElement(complete);
	
	
}

	
public WebElement ContiuetoHomePage() {
	
	
	return driver.findElement(contiue);
	
	
}

	
	

}
