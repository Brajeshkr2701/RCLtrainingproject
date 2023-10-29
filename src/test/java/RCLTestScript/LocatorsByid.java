package RCLTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsByid {

	public static void main(String[] args) {


		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ESVUAT01");
		
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dolphin1");
		
		driver.findElement(By.xpath("//input[@id='onLoginID']")).click();*/
		
		driver.findElement(By.xpath("//a[normalize-space()='REGISTER']")).click();
		
		System.out.println("method:"+driver.findElement(By.xpath("//input[@id='firstName']")).getAttribute("placeholder"));
		
		
	}
		
		
		
		

		
}
		
		
	


