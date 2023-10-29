package RCLTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwaitexample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.findElement(By.name("q")).sendKeys("selenium");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='About Selenium']")));
	element.click();
	

	}

}
