package RCLTestScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		//When you find type=file in the html we use send keys.
		Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
	    	Thread.sleep(3000);
	       // driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Administrator\\Desktop\\File selenium\\Sachin Tendulkar.pdf");	
	        
	             	
	   //Robot class
	    	//If click is not working.
	    	
	    //	driver.findElement(By.xpath("//input[@id='file-upload']")).click();
	    	
	   WebElement button=	driver.findElement(By.xpath("//input[@id='file-upload']"));
	   
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click();", button);//Perform click action on button.	
	   
	   //Three action i have to do
	   //...............................
	   //1.Copy the path
	  // 2.CTRL+V
	   //ENTER
	   //By using robot class.
	   
	   Robot rb=new Robot();
	   rb.delay(2000);
	   
	   //CTRL+C  or Put Path to file in a clipboard OR COPIED THE FILE IN TO CLIPBOARD
	   
	   StringSelection ss = new StringSelection("C:\\Users\\Administrator\\Desktop\\File selenium\\Sachin Tendulkar.pdf");
	   
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	   
	   //CTRL+v using robot class OR PASTE THE SAME PATH IN THE FILENAMEBOX
	   
	   rb.keyPress(KeyEvent.VK_CONTROL);
	   rb.keyPress(KeyEvent.VK_V);
	   rb.delay(2000);
	   rb.keyRelease(KeyEvent.VK_CONTROL);
	   rb.keyRelease(KeyEvent.VK_V);
	   rb.delay(2000);
	   //ENTER OR PRESS ENTER
	   rb.keyPress(KeyEvent.VK_ENTER);
	   rb.keyRelease(KeyEvent.VK_ENTER);
	   
	   
	   
	   
	   
	    	
	    	
	    	
	        
	     //if you get Type=File attribute than we use send keys.
	   //But if Type=File attribute not available than WE Use Robot Method.
	        
	        
	        
	             	 
	             	     
		
		
		

	}
	

	}


