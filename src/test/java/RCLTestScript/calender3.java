package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender3 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//driver.get("https://www.easemytrip.com/");
		//driver.get("https://www.redbus.in/");
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		//driver.get("https://demo.nopcommerce.com/");
		//driver.get("https://phptravels.net/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ESVUAT01");
		driver.findElement(By.id("password")).sendKeys("dolphin1");
		driver.findElement(By.id("onLoginID")).click();
		Thread.sleep(3000);
		
		String month="October 2023";
		String day="25";
		
		
		driver.findElement(By.xpath("//input[@id='etdDates']")).click();
	
		while(true)//So evertime this loop will becomes true onlybut as soon as we found exact month and year we will come out from while loop by 
			//using break command.
		{
	   String monthyearval=	driver.findElement(By.xpath("//th[@title='Select Month']")).getText();
	   //We have to capture month year value and match with expected value if it is ok than come out with break. and clickm on expected date. Otherwise ckick on next
	   //and it will be going repetedly until we got the expected value.
	    System.out.println(monthyearval);//September 2023
        if(monthyearval.equals(month))
       {
	   break;
      }
     else
      {

   driver.findElement(By.xpath("//span[@title='Next Month']")).click();
	
       }


		
	}
		
		//driver.findElement(By.xpath("//td[normalize-space()='10']")).click();
	      driver.findElement(By.xpath("//td[normalize-space()="+day+"]")).click();

}
}
