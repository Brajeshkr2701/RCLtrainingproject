package RCLTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextGetattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		
		//WebElement searchbox=driver.findElement(By.xpath("//input[@id='username']"));
		
		
		//System.out.println("Result from getattribute() method:"+searchbox.getAttribute("placeholder"));
		//System.out.println("Result from getText() method:"+searchbox.getText());
		
		
		
		WebElement searchbox1=driver.findElement(By.xpath("//label[normalize-space()='User Id | Username*']"));
		
		System.out.println("Result from getText() method:"+searchbox1.getText());
		System.out.println("Result from getattribute() method:"+searchbox1.getAttribute("for"));
		
		
		
		
//String 	 searchbox1=driver.findElement(By.xpath("//label[normalize-space()='User Id | Username*']")).getText();
		
		//System.out.println("Result from getText() method:"+searchbox1);
		
		
		
		
		
		
		
		
		
	/*	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ESVUAT01");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dolphin1");
		driver.findElement(By.xpath("//input[@id='onLoginID']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@onclick=\"callPageLoad('e_bookingServices');\"]//img")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@onclick=\"callPageLoad('e_create_booking_without_routing');\"]//img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='btn_ctn_ttn next-button shipmentCriteria']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='laden0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='laden0']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='laden0']")).sendKeys("123");
		
		//..................................................................................................
		
		   //  WebElement abc=driver.findElement(By.xpath("//input[@id='firstName']"));
		     
		// System.out.println( "Result from getAttribute() method:"+ abc.getAttribute("placeholder")) ;                                    
		
		
		
		
		
		
		
		

	}*/
	}
}
