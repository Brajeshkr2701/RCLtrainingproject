package RCLTestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\seleniumwithjava\\src\\main\\resources\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println("Title of the page is:"+driver.getTitle());
	 System.out.println("Current url the web page is:"+driver.getCurrentUrl());
	 System.out.println("Page Source is:"+driver.getPageSource());
	 
		
		
		
		
		
		
		
		
		

	}

}
