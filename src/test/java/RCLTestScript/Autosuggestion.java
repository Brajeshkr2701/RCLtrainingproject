package RCLTestScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//driver.get("https://www.bing.com/");
		driver.get("https://www.google.com/");
		//driver.get("https://www.redbus.in/");
		//driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	List<WebElement>	list=driver.findElements(By.xpath("//ul[@class='G43f7e']//li[@class='sbct']//div[@class='eIPGRd']//div[@class='wM6W7d']"));
	
	System.out.println("Size of autosuggestions:"+list.size());
	
	for(WebElement listitem:list)
	{
	//	if(listitem.getText().equals("selenium webdriver"))
			if(listitem.getText().contains("webdriver"))
		{
			listitem.click();
			break;
		}
	}
	
	

	}

}
