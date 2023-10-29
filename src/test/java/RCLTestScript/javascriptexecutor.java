package RCLTestScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecutor {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		//driver.get("https://demo.nopcommerce.com/");
        driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		
		
	//syntax	
//JavascriptExecutor js=(JavascriptExecutor)driver;		
//js.executeScript(null, args);

//uses of javascriptexecutor

//Flash
//Drawing border & take screenshot
		
	//WebElement logo=	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	/*WebElement logo=	driver.findElement(By.xpath("//div[@class='ng-scope']//i[@class='newHeaderLogo']"));
	javascriptutil.drawBorder(logo, driver);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File("C:\\Users\\Administrator\\git\\Seleniumproject\\ RCLProject\\Screenshots\\logoss.png");
	FileUtils.copyFile(src, trg);*/
		
	
	
//Getting title of the page
	
//String title=	javascriptutil.getTitleByJS(driver);
	//System.out.println(title);
	
	

//click action
		
	WebElement reglink=	driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Holidays']"));
		javascriptutil.clickElementByJS(reglink, driver);
		

//Generate alert
		
	
		
		//javascriptutil.generateAlert(driver, "This is my Alert...")	;
		
		
	
//Refreshing the page
		
		
	//	javascriptutil.refreshBrowserByJS(driver);
		
	
//scrolling down page
		
		//javascriptutil.scrollPageDown(driver);
	
//scroll up page
		
		Thread.sleep(4000);
		
		
		//javascriptutil.scrollPageUp(driver);

//zoom page
		
	//javascriptutil.zoomPageByJS(driver);
		



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
