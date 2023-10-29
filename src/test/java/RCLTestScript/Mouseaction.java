package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ESVUAT01");
		driver.findElement(By.id("password")).sendKeys("dolphin1");
		driver.findElement(By.id("onLoginID")).click();
		Thread.sleep(3000);
		
		   WebElement   mouseaction=driver.findElement(By.xpath("//div[@class='scroll-sidebar ps-container']"));
		
		
	
		Actions act = new Actions(driver);
		act.moveToElement(mouseaction).perform();
		//act.doubleClick(targetdoubleclick).perform();//Double click
		
		
		//driver.findElement(By.xpath("//span[normalize-space()='Profile']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='E-Booking']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();

	}

}
