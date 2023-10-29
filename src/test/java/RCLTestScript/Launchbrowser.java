package RCLTestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {

	public static void main(String[] args) {
		
		
		//Launch the Browser ist approach
		
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Administrator\\git\\Seleniumproject\\ RCLProject\\src\\main\\resources\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		
		//System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Administrator\\git\\Seleniumproject\\ RCLProject\\src\\main\\resources\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		//System.setProperty("Webdriver.edge.driver", "C:\\Users\\Administrator\\git\\Seleniumproject\\ RCLProject\\src\\main\\resources\\msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		
		//driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		
		
		
		//Launch the Browser 2nd approach
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		
		//driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		
		//driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
