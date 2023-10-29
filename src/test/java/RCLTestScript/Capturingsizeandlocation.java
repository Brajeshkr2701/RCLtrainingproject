package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capturingsizeandlocation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	WebElement	logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
	
	
	
	//Location  
	//First method
	System.out.println("Location(x,y):"+logo.getLocation());
	//System.out.println("Location(x):"+logo.getLocation().getX());
	//System.out.println("Location(y):"+logo.getLocation().getY());
	
	
	//Second method
	System.out.println("Location(x):"+logo.getRect().getX());
	System.out.println("Location(y):"+logo.getRect().getY());
	
	
	//size
	//First method
	
	System.out.println("Size(width,Height):"+logo.getSize());
	//System.out.println("Size(width):"+logo.getSize().getWidth());
	//System.out.println("Size(Height):"+logo.getSize().getHeight());
	
	//Second method
	
	System.out.println("Size(width):"+logo.getRect().getDimension().getWidth());
	System.out.println("Size(Height):"+logo.getRect().getDimension().getHeight());
	
	driver.close();
	
	
	
	
	
	
		
		

	}

}
