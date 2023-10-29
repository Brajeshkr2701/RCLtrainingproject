package RCLTestScript;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserhandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//To get Browser window ID.We have two methods 
		//getwindowhandle()-Return id of the single browser window.It will return String.
		//Getwindowhandles()-It will return ids of the multiple browser window.It will return Set<String>
		
		//getwindowhandle()
		
		
	//String windowID=driver.getWindowHandle();
	//System.out.println(windowID);//61CF220FF47A1027DECEA8555A6698AC
	//42EEF7D8DDC899BED11C8CA56213EDF3
		
		//getwindowhandles()
	
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	  Set<String> windowIDs= driver.getWindowHandles();
	  
	  //First method Iterator method
	  
/*	Iterator<String> it= windowIDs.iterator();
	String parentwindowid=it.next();//It will give Parent browser window iD.
	 String Childbrowserid=  it.next();//It will give Child browser window iD.
	 
	 System.out.println("Parent window id:"+parentwindowid);
	System.out.println("Child window id:"+Childbrowserid);*/
	 
	 //Second method
	 
	/* List<String> windowIDSList=new ArrayList(windowIDs);//Converting Set to List
	     String parentwindowid= windowIDSList.get(0);//Parent window ID.
	     String   Childbrowserid=  windowIDSList.get(1);//Child window ID.
	     System.out.println("Parent window id:"+parentwindowid);
	 	 System.out.println("Child window id:"+Childbrowserid);*/
	 	 
	 	 
	 	 //These ID required to switch between one browser window to another browser window.
	 	 
			 
	 
	 

//Parent window id:F643834291833151EAAE73CBC6176F0E
	// 	Child window id:DA40E7095950F7B5374BAC714AC0DF12	 
	 
	// Parent window id:41FE6F0C5451CA18B3991D410A973915
	 //	Child window id:5715AC2226997681410B4F0DE1077300
	 	 
	 	 //Parent window id:C72169C1D5F81826E5707460C0F60114
	 	//Child window id:482EF988659CE03E7FD8602A63F814AA
	 	 
	 	 
	 //	driver.switchTo().window(parentwindowid);//This will switch to parent window id.
	 	 
	 	// System.out.println("Parent window title:"+driver.getTitle());//This will give the parent window title.
	 	 
	 	// driver.switchTo().window(Childbrowserid);//This will switch to child window.
	 	 
	 	// System.out.println("Child window title:"+driver.getTitle());//This will give the Child window title.*/
	 	 
	 	// driver.switchTo().window(Childbrowserid);//This will switch to child window.
	 	 
	     // System.out.println("Child window title:"+driver.getTitle());//This will give the Child window title.
	 	 
	 	 
	 	//driver.switchTo().window(parentwindowid);//This will switch to parent window id.
	 	 
	 	// System.out.println("Parent window title:"+driver.getTitle());//This will give the parent window title.
	 	 
	
	 	 
	 	 
		 //Second method
		 
		/* List<String> windowIDSListt=new ArrayList(windowIDs);//Converting Set to List
		     String parentwindowidd= windowIDSListt.get(0);//Parent window ID.
		     String   Childbrowseridd=  windowIDSListt.get(1);//Child window ID.
		     System.out.println("Parent window id:"+parentwindowidd);
		 	 System.out.println("Child window id:"+Childbrowseridd);*/
		 	 
		 	 
		 	 
		 	 //For loop
	 	 
	 	// for(String winddiid:windowIDSList)
	 //	 {
	 		 
	 		//String   title=driver.switchTo().window(winddiid).getTitle();
	 		//System.out.println(title);
	 //	 }
 	 for(String winddiid:windowIDs)
		 {
 		System.out.println(winddiid);
	 		 
	 		String   title=driver.switchTo().window(winddiid).getTitle();
	 		System.out.println(title);
		 }
	 	 
	  //driver.close();
	 	 
	 	// driver.quit();
	 	 
	 	 //Close specific browser by choice
	 	 
	 	 
	 	 for(String winiiidddd:windowIDs)
	 	 {
	 		System.out.println(winiiidddd);
	 		String title=driver.switchTo().window(winiiidddd).getTitle();
	 		if(title.equals("OrangeHRM HR Software | OrangeHRM"))
	 		{
	 			driver.close();
	 		}
	 		
	 	 }
	 	 
		 	 
		 	 
		 	 
	 
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	
	
	
		

	}

}
