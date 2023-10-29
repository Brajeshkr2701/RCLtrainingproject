package RCLTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisplayedEnabledSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
       WebElement searchbox=driver.findElement(By.xpath("//input[@id='fname']"));
		
            System.out.println("Display status:"+searchbox.isDisplayed());
            
            System.out.println("Display status:"+searchbox.isEnabled());

	}

}
