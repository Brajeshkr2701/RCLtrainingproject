package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightclick {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ESVUAT01");
		driver.findElement(By.id("password")).sendKeys("dolphin1");
		driver.findElement(By.id("onLoginID")).click();
		
//	WebElement Rightclick=	driver.findElement(By.xpath("//button[@onclick='longTermService(\"minimizeScreen\")']"));
	WebElement Myaccountrightclick=	driver.findElement(By.xpath("//a[normalize-space()='MY ACCOUNT']"));
	WebElement Longtermrightclick=	driver.findElement(By.xpath("//div[@id='button2']"));
	WebElement Porttoportrightclick=	driver.findElement(By.xpath("//div[@id='button1']"));

	
		Actions act=new Actions(driver);
		act.contextClick(Porttoportrightclick).perform();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
	//	wait.until(ExpectedConditions.
		
		

	}

}
