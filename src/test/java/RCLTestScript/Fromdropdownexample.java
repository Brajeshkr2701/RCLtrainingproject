package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fromdropdownexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://uat-eservice.rclgroup.com/e-commerce/");
		driver.manage().window().maximize();
	
		
		driver.findElement(By.id("username")).sendKeys("ESVUAT01");
		driver.findElement(By.id("password")).sendKeys("dolphin1");
		driver.findElement(By.id("onLoginID")).click();
		  Thread.sleep(2000);
		
		                /* WebElement Fromdrp=driver.findElement(By.id("pol"));
		                 
		                 Select from=new Select(Fromdrp);
		                 
		               
		                 from.selectByVisibleText("SGSIN - SINGAPORE");*/
		                 
		WebElement    rightclick=driver.findElement(By.xpath("//button[@onclick='longTermService(\"minimizeScreen\")']"));
		Actions act=new Actions(driver);
		//act.contextClick(rightclick).perform();
		act.doubleClick(rightclick).perform();
		
		

	}

}
