package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPageBetter {

	// This is a login CLass
	WebDriver driver;

			
	public LoginPageBetter (WebDriver driver) {
				
		this.driver = driver;	
	}
		
	By username = By.id("login_Email");
	By password = By.id("login_Password");
	By login = By.id("login");
	By logout = By.xpath(".//*[@id='menu']/ul/li/a");	
			
	
	public WebElement username() {
		
		
		return driver.findElement(username);
		
		
	}
	
	

	public WebElement Password() {
		
		
		return driver.findElement(password);
		
		
	}

	public WebElement Login() {
		
		
		return driver.findElement(login);
		
		
	}
	
	
public WebElement Logout() {
		
		
		return driver.findElement(logout);
		
		
	}
	
}
