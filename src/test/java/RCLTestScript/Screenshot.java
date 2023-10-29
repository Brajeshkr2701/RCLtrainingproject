package RCLTestScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		//driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		driver.manage().window().maximize();
		
		//Full page screenshot
		
		/*TakesScreenshot ts=(TakesScreenshot) driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
         File  trg= new File("C:\\Users\\Administrator\\git\\Seleniumproject\\ RCLProject\\Screenshots\\rcl.png");
	       FileUtils.copyFile(src, trg);*/
		
		//Screenshot of section/portion of the page
	       
		        /* WebElement  section= driver.findElement(By.xpath("//div[@class='form-sec-lg']//form"));
		        File src= section.getScreenshotAs(OutputType.FILE);
		         File  trg= new File("C:\\Users\\Administrator\\git\\Seleniumproject\\ RCLProject\\Screenshots\\smallsection.png");
		          FileUtils.copyFile(src, trg);*/
		          
		          
	//Screenshot of specific webElement
		          
		 WebElement  element= driver.findElement(By.xpath("//h3[contains(text(),'Welcome to RCL')]"));
		           
		 File src2= element.getScreenshotAs(OutputType.FILE);
	  File  trg2= new File("C:\\Users\\Administrator\\git\\Seleniumproject\\ RCLProject\\Screenshots\\heading.png");
	       FileUtils.copyFile(src2, trg2);
	       
	   
	 
	          
		
		
		 
		  
		

	}

}
