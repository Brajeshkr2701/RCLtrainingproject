package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Openlinkinnewtab {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/tooltip/");
		
	String	newtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	driver.findElement(By.xpath("//a[normalize-space()='Plugins']")).sendKeys(newtab);
	
	
	
		
		

	}

}
