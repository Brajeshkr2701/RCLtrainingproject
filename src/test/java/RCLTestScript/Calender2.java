package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender2 {

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
		String day="10";
		
		
		driver.findElement(By.xpath("//input[@id='etdDates']")).click();
	
		
	String monthyearval=	driver.findElement(By.xpath("//th[@title='Select Month']")).getText();

		System.out.println(monthyearval);//September 2023
		
	//String month=	monthyearval.split(" ")[0].trim();
	String year=	monthyearval.split(" ")[1].trim();	
	
	while(!(month.equals("October") && year.equals("2023")))
	{
		driver.findElement(By.xpath("//span[@title='Next Month']")).click();
	 monthyearval=	driver.findElement(By.xpath("//th[@title='Select Month']")).getText();

		System.out.println(monthyearval);//September 2023
		
	month=	monthyearval.split(" ")[0].trim();
	 year=	monthyearval.split(" ")[1].trim();	
	}
	
	driver.findElement(By.xpath("//td[normalize-space()='10']")).click();
	//driver.findElement(By.xpath("//td[normalize-space()="+day+"]")).click();

	}
		
	/*	public static void getMonthYear(String monthYearVal)
		{
			
		}
	
	
	
	public static void selectDate(String exDay, String ExMonth, String exYear)
	{
		String monthyearval=	driver.findElement(By.xpath("//th[@title='Select Month']")).getText();
		System.out.println(monthyearval);//September 2023
		
	String month=	monthyearval.split(" ")[0].trim();
	String year=	monthyearval.split(" ")[1].trim();	
	
	while(!(month.equals("October") && year.equals("2023")))
	{
		driver.findElement(By.xpath("//span[@title='Next Month']")).click();
	 monthyearval=	driver.findElement(By.xpath("//th[@title='Select Month']")).getText();

		System.out.println(monthyearval);//September 2023
		
	month=	monthyearval.split(" ")[0].trim();
	 year=	monthyearval.split(" ")[1].trim();	
	}
	
	driver.findElement(By.xpath("//td[normalize-space()='"+exDay+"']")).click();
		

	}*/
	
	
		
	}


