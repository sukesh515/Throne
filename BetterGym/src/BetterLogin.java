
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;




public class BetterLogin {
	
	public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\sukeshswathi\\Documents\\TarunSelenium\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();

	        BetterLogin Bet = new BetterLogin();
	        
		WebDriver driver = new FirefoxDriver();
		
		
				
		 driver.get("https://better.legendonlineservices.co.uk/enterprise/account/login");	
		 
		 System.out.println(driver.manage().window().getSize());
			Dimension d = new Dimension(1200,1400);
			//Resize the current window to the given dimension
			driver.manage().window().setSize(d);
			
		 
		 driver.findElement(By.id("login_Email")).sendKeys("sukesh515@gmail.com");
		 driver.findElement(By.id("login_Password")).sendKeys("Hyundai515");
		 driver.findElement(By.id("login")).click();
					 
		 
		 
		 
		 		 
		 driver.findElement(By.linkText("Make a Booking")).click();
		 
	
		
		 // Avoneil is unchecked and then checked
		 
		 driver.findElement(By.xpath(".//*[@id='contentWrapper']/div[2]/div/div[2]/div[1]/form/div[3]/label/input")).click();
					 
		 driver.findElement(By.xpath(".//*[@id='contentWrapper']/div[2]/div/div[2]/div[1]/form/div[3]/label/input")).click();
		 
              Thread.sleep(120);
              
			 // Other activities is checked 
             /* Actions act = new Actions(driver);
              System.out.println("Double clicked on otheractivities ");
              act.moveToElement(driver.findElement(By.xpath(".//*[@id='behaviours']/div[2]/label"))).doubleClick().build().perform();
              */
              driver.findElement(By.xpath(".//*[@id='behaviours']/div[2]/label")).click();
              System.out.println("Sleeping for 320S ");
		   // Again other activities is checked since Badminton is not visible
		    Thread.sleep(3220L);
		    System.out.println("Double clicked again 2nd time otheractivities ");
		    // act.moveToElement(driver.findElement(By.xpath(".//*[@id='behaviours']/div[2]/label"))).doubleClick().build().perform();
		  driver.findElement(By.xpath(".//*[@id='behaviours']/div[2]/label")).click();
		  
		 // Badminton checkbox is checked 
		     System.out.println("Checking Badminton ");
		     Thread.sleep(3220L);
		  driver.findElement(By.xpath(".//*[@id='activities']/div[1]/label")).click();   
		  
		//  driver.manage().window().maximize();
     		  
		//  Bet.waitUntilElementExists(By.xpath(".//*[@id='bottomsubmit']"), 300, 6);
		 		  
		  System.out.println("Clicking Submit Button ");
		     Thread.sleep(3220L);
		  
		driver.findElement(By.xpath(".//*[@id='bottomsubmit']")).click();
		
		Thread.sleep(3220L);
		
		// driver.findElement(By.xpath(".//*[@id='TB_window']")).click();
		
		
		driver.switchTo().frame("TB_iframeContent");
		
		driver.findElement(By.xpath(".//*[@id='slot250503']")).click();
		
		Thread.sleep(3220L);
		// driver.switchTo().window(".//*[@id='TB_window']");
		
		System.out.println("Add to Basket Popup window ");
		
		driver.switchTo().frame("TB_iframeContent");
		
		 //driver.findElement(By.xpath(".//*[@id='cmbAvailableCourts']")).click();
		
		
		driver.findElement(By.linkText("Add to Basket")).click();
		
		Thread.sleep(3220L);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath(".//*[@id='submenu']/ul/li[12]/a")).click();
		//driver.findElement(By.xpath("html/body/div[2]/div/div/fieldset/div/a[2]")).click();
		
		// driver.switchTo().frame("TB_iframeContent");
		
		//driver.findElement(By.linkText("OK")).click();
		
		
		
		Thread.sleep(3220L);
		
		System.out.println("This will complete the Booking ");
		
		driver.findElement(By.linkText("Complete")).click();
		driver.findElement(By.linkText("Continue")).click();
		
		
		//driver.close();
		
		/*if (count ==0)
			
		{
			System.out.println("Verified Element is not found ");
		}
			*/
		  
	  


	}

	
	
	
	
	
	public void waitUntilElementExists(By by, int waitSeconds,int noOfRetries) {
	    driver.manage().timeouts().implicitlyWait(waitSeconds, TimeUnit.SECONDS);
	    boolean foundElement = false;
	    for (int i = 0; i < noOfRetries; i++)
	        try {
	            driver.findElement(by);
	            foundElement = true;
	            break;
	        } catch (Exception e) {
	        }
	}
}
	
	
	
	
