package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDatepickers {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ESVUAT01");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dolphin1");
	driver.findElement(By.xpath("//input[@id='onLoginID']")).click();
	
	String month="November 2023";
	String day="15";
	
	driver.findElement(By.xpath("//input[@id='etdDates']")).click();
	
	//while(true)
	//{
		String monthyearvalue=driver.findElement(By.xpath("//th[@title='Select Month']")).getText();
		System.out.println(monthyearvalue);
		
	/*	if(monthyearvalue.equals(month))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//span[@title='Next Month']")).click();
		}
		
	}
	
	driver.findElement(By.xpath("//td[normalize-space()="+day+"]")).click();*/
	
	
	
	

	}

}
