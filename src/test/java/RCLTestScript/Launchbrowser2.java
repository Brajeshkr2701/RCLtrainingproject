package RCLTestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//chrome browser
		
		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\Administrator\\git\\Seleniumproject\\ RCLProject\\src\\main\\resources\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		
		
		//Firefox Browser
		
		//System.setProperty("Webdriver.gecko.driver","C:\\Users\\Administrator\\git\\Seleniumproject\\ RCLProject\\src\\main\\resources\\geckodriver.exe");
		//WebDriver driver2=new FirefoxDriver();
		//driver2.get("https://uat-eservice.rclgroup.com/e-commerce/");
		
		
		//Launching browser using WebDrivermanager
		
		
		//chrome
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		
		//Firefox
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver2=new FirefoxDriver();
		//driver2.get("https://uat-eservice.rclgroup.com/e-commerce/");
		
		//Edge
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver3=new EdgeDriver();
		//driver3.get("https://uat-eservice.rclgroup.com/e-commerce/");
		
		
		
		System.out.println("Title of the web page is:"+driver.getTitle());
		
		System.out.println("Current URL of the web page is:"+driver.getCurrentUrl());
		
		System.out.println("Current URL of the web page is:"+driver.getPageSource());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
