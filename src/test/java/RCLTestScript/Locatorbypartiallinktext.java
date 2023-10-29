package RCLTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorbypartiallinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		
		//driver.findElement(By.partialLinkText("REGIST")).click();
		
		//driver.findElement(By.partialLinkText("Forget Pass")).click();
		
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("ESVUAT01");
		
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("ESVUAT01");
		
		
		
		

	}

}
