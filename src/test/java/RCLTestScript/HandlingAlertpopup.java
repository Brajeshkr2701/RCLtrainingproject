package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlertpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		//Alert window with ok button
		
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	//	Thread.sleep(3000);
		
	//	driver.switchTo().alert().accept();
		
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		//Thread.sleep(3000);
		
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		
	     Alert alertwindow=driver.switchTo().alert();
	     
	     System.out.println("The message displayed on alert:"+ alertwindow.getText());
	     
	     alertwindow.sendKeys("India");
	     alertwindow.accept();
	     
	     
	  
	     
	     
		

	}

}
