package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingframeinsidetheframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		
	//outer frame
		
		//driver.switchTo().frame("iframeResult");//switch to outer frame
		
		driver.switchTo().frame(1);//switch to inner frame
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);//switch to inner frame
		
	//WebElement	innerframe=driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
	
	//driver.switchTo().frame(innerframe);
		
		
		
		System.out.println("Text present inside the inner frame:"+driver.findElement(By.xpath("//h1[normalize-space()='This page is displayed in an iframe']")).getText());
		
		
	driver.switchTo().parentFrame();//Go to parent frame or outer frame	
	
	System.out.println("Text present inside the outer frame:"+driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText());
	
	
		
		
		
		
		
		
		

	}

}
