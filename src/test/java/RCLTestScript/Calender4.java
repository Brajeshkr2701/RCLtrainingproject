package RCLTestScript;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//driver.get("https://www.easemytrip.com/");
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		//driver.get("https://www.redbus.in/");
		//driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		//driver.get("https://demo.nopcommerce.com/");
		//driver.get("https://phptravels.net/");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		Thread.sleep(2000);
		
	Select monthdrp=new Select(	driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
	Thread.sleep(2000);
	
	monthdrp.selectByVisibleText("Oct");
	
	
	Select yeardrp=new Select(	driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
	Thread.sleep(2000);
	
	monthdrp.selectByVisibleText("1990");
	Thread.sleep(2000);
	
	
	String date="15";
	
	List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	for(WebElement ele:alldates)
	{
		String dt=ele.getText();
		if(dt.equals(date))
		{
			ele.click();
			break;
		}
	}
	

	}

}
