package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxhandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("def");
		driver.findElement(By.xpath("//input[@id='userInfoMod_email']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@id='reEmailAddress']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@id='userInfoMod_userId']")).sendKeys("Ghi123");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("bkcognis1");
		driver.findElement(By.xpath("//input[@id='rePassword']")).sendKeys("bkcognis1");
		driver.findElement(By.xpath("//div[@class='btn btn-primary next-button_reg_fir ']")).click();
		driver.findElement(By.xpath("//input[@id='companyName']")).sendKeys("a");
		driver.findElement(By.xpath("//input[@id='companyName']")).sendKeys("a");
		driver.findElement(By.xpath("//input[@id='inputAddress1']")).sendKeys("b");
		
		           WebElement country=driver.findElement(By.id("inputCountry"));
		           Select countrydrp=new Select(country);
		           countrydrp.selectByVisibleText("INDIA");
		           
		           driver.findElement(By.xpath("//input[@id='inputState']")).sendKeys("MP");
		           
		      WebElement City= driver.findElement(By.id("inputCity"));
		      Select citydrp=new Select(City);
		      citydrp.selectByVisibleText("INDORE");
		      driver.findElement(By.xpath("//input[@id='phoneNo']")).sendKeys("1234567890");
		      driver.findElement(By.xpath("//div[@class='btn btn-primary next-button1 ']")).click();
				/*WebElement   checkbox1= driver.findElement(By.xpath("//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[4]//div[1]//div[1]//div[2]//input[1]"));
				
				
				System.out.println("Enabled status:"+checkbox1.isEnabled());
				System.out.println("Displayed status:"+checkbox1.isDisplayed());
				System.out.println("Selected status:"+checkbox1.isSelected());
				
				checkbox1.click();
				
				System.out.println("Enabled status:"+checkbox1.isEnabled());
				System.out.println("Displayed status:"+checkbox1.isDisplayed());
				System.out.println("Selected status:"+checkbox1.isSelected());*/
				
				
		      
	
		 /*   WebElement checkbox2=driver.findElement(By.xpath("//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[4]//div[1]//div[1]//div[1]//input[1]"));
		    System.out.println("Enabled status:"+checkbox2.isEnabled());
			System.out.println("Displayed status:"+checkbox2.isDisplayed());
			System.out.println("Selected status:"+checkbox2.isSelected());
			
			checkbox2.click();
			
		              System.out.println("Enabled status:"+checkbox2.isEnabled());
					System.out.println("Displayed status:"+checkbox2.isDisplayed());
					System.out.println("Selected status:"+checkbox2.isSelected());*/
			
			
			
		    
		WebElement    checkbox3= driver.findElement(By.xpath("//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[4]//div[1]//div[1]//div[3]//input[1]"));   
	    System.out.println("Enabled status:"+checkbox3.isEnabled());
			System.out.println("Displayed status:"+checkbox3.isDisplayed());
			System.out.println("Selected status:"+checkbox3.isSelected());
			
			checkbox3.click();
			  System.out.println("Enabled status:"+checkbox3.isEnabled());
				System.out.println("Displayed status:"+checkbox3.isDisplayed());
				System.out.println("Selected status:"+checkbox3.isSelected());
			
			
			
	}

}
