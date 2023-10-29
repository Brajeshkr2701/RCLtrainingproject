package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertwindow2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//Syntax
		
	//	https://admin:admin@the-internet.herokuapp.com/basic_auth
		//http://user:password@URL
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	//Authenticated popups	
		

	}

}
