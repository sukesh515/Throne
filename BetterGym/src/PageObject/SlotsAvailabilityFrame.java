package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SlotsAvailabilityFrame {

	
WebDriver driver;

	
	public SlotsAvailabilityFrame (WebDriver driver) {
				
		this.driver = driver;	
	}
	
	
    String   Slotframe = "TB_iframeContent" ;
	
	By dayandtime = By.xpath(".//*[@id='slot250845']");
	
	By basket = By.linkText("Add to Basket");
	
	
public WebDriver SwitchtoFrame() {
		
		
		return driver.switchTo().frame(Slotframe);
		
	}
	

public WebElement ChoosingDateandTime() {
	
	
	return driver.findElement(dayandtime);
	
	
}



public WebElement AddingtoBasket() {
	
	
	return driver.findElement(basket);
	
	
}














	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
