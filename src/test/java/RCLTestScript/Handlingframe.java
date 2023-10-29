package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		
		//1st frame
		
		driver.switchTo().frame("packageListFrame");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='java.applet']")).click();
		
		System.out.println("Welcome to selenium");
		
		driver.switchTo().defaultContent();//Go back to the main page.
		Thread.sleep(5000);
		
		
		
		//2nd frame
		
		driver.switchTo().frame("packageFrame");
		
		
		driver.findElement(By.xpath("//span[normalize-space()='AppletContext']")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		
		//3rd frame
		
		
		driver.switchTo().frame("classFrame");
		
	
		driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Help']")).click();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		

	}

}
