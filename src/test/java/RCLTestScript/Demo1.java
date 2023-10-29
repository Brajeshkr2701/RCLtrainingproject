package RCLTestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	
	@Test(groups = "smokeTest")
	public void createRegistration() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println("Title of the page is:"+driver.getTitle());
	 System.out.println("Current url the web page is:"+driver.getCurrentUrl());
	 System.out.println("Page Source is:"+driver.getPageSource());
	 
	 
	 System.out.println("India is my country");
	 System.out.println("India is my country");
	 
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
