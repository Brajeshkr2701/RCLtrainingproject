package RCLTestScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownhandlingwithoutselectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("ESVUAT01");
		driver.findElement(By.id("password")).sendKeys("dolphin1");
		driver.findElement(By.id("onLoginID")).click();
		
	      WebElement fromdrp= driver.findElement(By.id("pol"))  ; 
	      Select from=new Select(fromdrp);
	     // from.selectByVisibleText("SGSIN - SINGAPORE");
	      
	      
	      
	   List<WebElement> alloptions =from.getOptions();
	      
	      for( WebElement option:alloptions)
	      {
	    	  if(option.getText().equals("SGSIN - SINGAPORE"))
	    	  {
	    		  option.click();
	    		  break;
	    	  }
	      }
	      
	          WebElement Todrp=  driver.findElement(By.id("pod"));
	          
	          Select To=new Select(Todrp);
	          
	         // To.selectByVisibleText("THBKK - BANGKOK");
	          
	                       List<WebElement> alltooptions  = To.getOptions();
	                       for(WebElement tooption:alltooptions)
	                       {
	                    	   if(tooption.getText().equals("THBKK - BANGKOK"))
	                    	   {
	                    		   tooption.click();
	                    		   break;
	                    	   }
	                       }
	                       driver.findElement(By.xpath("//button[@onclick='longTermService(\"minimizeScreen\")']")).click();
	                       
	                       driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/button[1]")).click();
	                       driver.findElement(By.xpath("//div[@class='btn_ctn_ttn next-button shipmentCriteria']")).click();
	      
	      
	                       WebElement polterm= driver.findElement(By.id("pol"))  ; 
	             	      Select pol=new Select(polterm);
	             	     pol.selectByVisibleText("BOM");
	             	     
	                     WebElement podterm= driver.findElement(By.id("pod"))  ; 
	             	      Select pod=new Select(podterm);
	             	     pod.selectByVisibleText("ICD");
	             	     
	             	     
	             	  WebElement  Typedrp= driver.findElement(By.id("type0"));
	             	  Select type=new Select(Typedrp);
	             	 type.selectByVisibleText("HI - THERMAL INSULATED");
	             	 
	             	 
	             	 
	             	WebElement   sizedrp= driver.findElement(By.id("size0"));
	             	Select size=new Select(sizedrp);
	             	size.selectByVisibleText("40");
	             	
	             	WebElement cargodrp=driver.findElement(By.id("cargoType0"));
	             	Select cargo=new Select(cargodrp);
	             	
	        List<WebElement>   alloptions1 	=cargo.getOptions();
	        for(  WebElement options1 :alloptions1)
	        {
	        	if(options1.getText().equals("DG"))
	        	{
	        		options1.click();
	        		break;
	        	}
	        }
	             	
	             	
	             	 
	             	 
	             	     
		
		
		

	}

}
