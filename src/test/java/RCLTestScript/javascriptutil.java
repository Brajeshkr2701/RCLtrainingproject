package RCLTestScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascriptutil {
	
	
	//Draw borders
	public static void drawBorder(WebElement element,WebDriver driver)
	{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.border='3px solid red'",element);
}
	
	
	//gettitle
	public static String getTitleByJS(WebDriver driver)
	{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	String title=js.executeScript("return document.title;").toString();
	return title;
}
	
	//ClickElement
	
	public static void clickElementByJS(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
}
	//generate alert
	public static void generateAlert(WebDriver driver,String message)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
}
	
	//Refresh browser
	
	public static void refreshBrowserByJS(WebDriver driver)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
}
	
	//scroll page down
	
	public static void scrollPageDown(WebDriver driver)
	{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
	
	//scroll page up
	
	public static void scrollPageUp(WebDriver driver)
	{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
}
	
	
	//Zoom
	
	public static void zoomPageByJS(WebDriver driver)
	{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("document.body.style.zoom='50%'");
}
	

	
	
	
	
	
	
	
}