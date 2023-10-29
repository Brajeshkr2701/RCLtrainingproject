package RCLTestScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingjavascriptexecutor {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		
		//Drawing border & Take screenshot
		//WebElement	logo=driver.findElement(By.xpath("//div[@id='dvfarecal']"));
		//Handlingjavascriptutil.drawborder(logo, driver);
	/*WebElement	logo=driver.findElement(By.xpath("//div[@class='ng-scope']//i[@class='newHeaderLogo']"));
		
	Handlingjavascriptutil.drawborder(logo, driver);
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File("C:\\Users\\Administrator\\git\\Seleniumproject\\ RCLProject\\Screenshots\\Easemytriplogo.png");
	FileUtils.copyFile(src, trg);*/
	
	
	
	//Getting title of the page
	
//String 	title=Handlingjavascriptutil.getTitlebyJS(driver);
//System.out.println(title);


//click Action

    //  WebElement holidays=driver.findElement(By.xpath("//div[@class='ng-scope']//a[normalize-space()='Holidays']"));
      
      
    //  holidays.click();
      
     // Handlingjavascriptutil.clickElementByJS(holidays, driver);
      
      
      //Generate alert
      
     // Handlingjavascriptutil.generatealert(driver, "Asia cup India vs Srilanka.....");
      
      
      //Refreshing the page
		
	//	Handlingjavascriptutil.RefreshbrowserbyJS(driver);
      
      
	
	
	//Scroll down
		
		//Handlingjavascriptutil.scrollPageDown(driver);
		
		
		//Thread.sleep(5000);
		
		
		//Scrll up
		
		
		//Handlingjavascriptutil.scrollPageup(driver);
		
		//Zoom
		
		Handlingjavascriptutil.ZoomPageByJS(driver);
	
	
	
		
	

	}

}
