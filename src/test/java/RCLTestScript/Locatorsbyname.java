package RCLTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorsbyname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		
		driver.findElement(By.name("username")).sendKeys("ESVUAT01");
		//driver.findElement(By.className("input-form")).sendKeys("ESVUAT01");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.name("password")).sendKeys("dolphin1");
		
		driver.findElement(By.className("input-form mb-1")).sendKeys("dolphin1");
		
		Thread.sleep(2000);
		
		
		//driver.findElement(By.id("onLoginID")).click();
		
		driver.findElement(By.id("onLoginID")).click();
		
		
		

	}

}
