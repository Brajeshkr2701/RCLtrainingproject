package RCLTestScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileuploading {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Administrator\\Desktop\\File selenium\\Sachin Tendulkar.pdf");
		
		
		//By Using Robot class
		
		
         WebElement	button=	driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
		
		//three actions 
		//................
		
		//CTRL+C
		//CTRL+v
		//Enter
		
		Robot run=new Robot();
		run.delay(2000);
		
		
		//CTRL+c
		
		StringSelection suv=new StringSelection("C:\\Users\\Administrator\\Desktop\\File selenium\\Sachin Tendulkar.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(suv, null);
		
		//CTRL+v 
		
		run.keyPress(KeyEvent.VK_CONTROL);
		run.keyPress(KeyEvent.VK_V);
		run.delay(2000);
		run.keyRelease(KeyEvent.VK_CONTROL);
		run.keyRelease(KeyEvent.VK_V);
		run.delay(2000);
		
		
		//Enter
		run.keyPress(KeyEvent.VK_ENTER);
		run.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
