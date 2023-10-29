package RCLTestScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownhandlingbyusingselectclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("ESVUAT01");
		driver.findElement(By.id("password")).sendKeys("dolphin1");
		driver.findElement(By.id("onLoginID")).click();
	//	Actions act = new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//div[@class='scroll-sidebar ps-container']"))).perform();
	WebElement	sliderbar=driver.findElement(By.xpath("//div[@class='scroll-sidebar ps-container']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", sliderbar);    
		sliderbar.click();
		
	      /* WebElement fromdrp= driver.findElement(By.id("pol"))  ;     
	         
	         Select from=new Select(fromdrp);
	        from.selectByVisibleText("SGSIN - SINGAPORE");
	         
	        // from.selectByIndex(3);
	          // List<WebElement> alloptions= from.getOptions();
	          // for( WebElement option:alloptions)
	         //  {
	        	 //  if(option.getText().equals("SGSIN - SINGAPORE"))
	        	  // {
	        		 //  option.click();
	        		 //  break;
	        	  // }
	          // }
	
		         
		
		         
		     
		       WebElement Todropdown= driver.findElement(By.id("pod"))  ;     
		         
		         Select todrop=new Select(Todropdown);
		        todrop.selectByVisibleText("THBKK - BANGKOK");
		        
		       // driver.findElement(By.xpath("//button[@onclick='longTermService(\"minimizeScreen\")']")).click();
		       // driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/button[1]")).click(); 
		       /// driver.findElement(By.xpath("//div[@class='btn_ctn_ttn next-button shipmentCriteria']")).click();

			      // WebElement abc= driver.findElement(By.xpath("//select[@id='type0']"))  ;     
			         
			        // Select def=new Select(abc);
			        // def.selectByVisibleText("UT - OPEN TOP");*/
		
		
		        
		        
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		
	
	}

}
