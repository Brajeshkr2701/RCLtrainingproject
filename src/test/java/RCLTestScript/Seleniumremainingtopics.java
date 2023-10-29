package RCLTestScript;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumremainingtopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
      driver.get("https://uat-eservice.rclgroup.com/e-commerce/spring/index?action=eBooking");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ESVUAT01");
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dolphin1");
      driver.findElement(By.xpath("//input[@id='onLoginID']")).click();
      driver.findElement(By.xpath("//a[@onclick=\"callPageLoad('e_bookingServices');\"]//img")).click();
      driver.findElement(By.xpath("//a[@onclick=\"callPageLoad('e_create_booking_without_routing');\"]//div[@class='col-md-9 head_text_sub']")).click();
      driver.findElement(By.xpath("//div[@class='btn_ctn_ttn next-button shipmentCriteria']")).click();
       WebElement wb= driver.findElement(By.xpath("//select[@id='bookingPol']"));
       Select se=new Select(wb);
       se.selectByVisibleText("THBKK - BANGKOK");
       
       WebElement wb1= driver.findElement(By.xpath("//select[@id='bookingPod']"));
       Select se1=new Select(wb1);
       se1.selectByVisibleText("SGSIN - SINGAPORE");
       
           WebElement wb2=driver.findElement(By.xpath("//input[@id='range']"));
           
          System.out.println("Location of the slider:"+wb2.getLocation());
          System.out.println("Height & width of the element:"+wb2.getSize());
          
          
          Actions act =new Actions(driver);
          act.dragAndDropBy(wb2,100, 0).perform();
          
          System.out.println("Location of the slider:"+wb2.getLocation());
          System.out.println("Height & width of the element:"+wb2.getSize());
          
           
       
  
      
      
      
      
     
      
		

	}

}
