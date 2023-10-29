package RCLTestScript;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
		//driver.get("https://www.redbus.in/");
		//driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//How to capture cookies from browser
Set<Cookie>	cookies=	driver.manage().getCookies();
System.out.println("Size of cookies:"+cookies.size());//5


//How to print cookies from browser?

for(Cookie cookie:cookies)
{
	System.out.println(cookie.getName()+" : "+cookie.getValue());
}


//How to add cookies to the browser ?

Cookie cookieobj=new Cookie("Mycookie123","123456");
driver.manage().addCookie(cookieobj);

 cookies=	driver.manage().getCookies();
System.out.println("Size of cookies after adding:"+cookies.size());//6




//How to delete specific Cookie from the browser ?
//Two Methods
//driver.manage().deleteCookie(cookieobj);//pass cookie object
driver.manage().deleteCookieNamed("Mycookie123");// Pass the Name of the cookie

cookies=	driver.manage().getCookies();
System.out.println("Size of cookies after deletion:"+cookies.size());//5

//How to delete all the cookies from the browser.

driver.manage().deleteAllCookies();
cookies=	driver.manage().getCookies();
System.out.println("Size of cookies after Alldeletion:"+cookies.size());//0





	

		

		
		
		
		
		
		

	}

}
