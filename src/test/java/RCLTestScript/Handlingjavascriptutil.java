package RCLTestScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Handlingjavascriptutil {
	
	
	
	//Draw borders
	
	public static void drawborder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	
	//Getting title
	
	public static String getTitlebyJS(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	String title=	js.executeScript("return document.title").toString();
	return title;
	}
	
	//click action
	
	public static void clickElementByJS(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	
	//Generate alert
	
	public static void generatealert( WebDriver driver,String message)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
	}
	
	//Refreshing the page
	
	public static void RefreshbrowserbyJS( WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	
	//sCROLL PAGE dOWN
	
public static void scrollPageDown(WebDriver driver)
{
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
}


//sCROLL PAGE Up

public static void scrollPageup(WebDriver driver)
{
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	
}

//Zoom


public static void ZoomPageByJS(WebDriver driver)
{
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");
	
}


	
	
	
	
	
	
	
	
	
	
	
	}


