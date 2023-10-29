package RCLTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement   image1=driver.findElement(By.xpath("//li[1]"));
		WebElement   image2=driver.findElement(By.xpath("//li[2]"));
		
		WebElement   trash=driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act =new Actions(driver);
		act.dragAndDrop(image1, trash).perform();
		act.dragAndDrop(image2, trash).perform();
		
		
		
		
		
		
		

	}

}
