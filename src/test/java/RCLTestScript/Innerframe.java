package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Innerframe {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");//switch to outer iframe.
		
	WebElement innerframe=	driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		//driver.switchTo().frame(0);//switch to inner iframe
		driver.switchTo().frame(innerframe);
		
		
	System.out.println(	"Text present inside the inner frame:"+driver.findElement(By.xpath("//h1")).getText());
	
	driver.switchTo().parentFrame();//go to parent frame or outer frame.
	
	System.out.println(	"Text present in Outer frame:"+driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText());

	}

}
