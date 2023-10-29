package RCLTestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	//	driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		//driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();//Flipkart
		
		Thread.sleep(2000);
		
		driver.navigate().forward();//Amazon
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();//Refresh
		
		

	}

}
