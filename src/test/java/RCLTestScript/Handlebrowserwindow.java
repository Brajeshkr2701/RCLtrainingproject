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

public class Handlebrowserwindow {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//To get Browser window id. we have two commands one is getwindowhandles and another is getwindowhandles. return id of 
		//the single browser window and return ids of the multiple browser window.
		//getwindowhandle()-: It will return string
		//getwindowhandles()-:It will return List<String>
		
		//getwindowhandle()
		
	String windowID=	driver.getWindowHandle();//Return id of the single browser window.It is dynamic and it will generate at runtime.
	//System.out.println(windowID);//1A14D85AC629C883BFC259EE806ACD0C
	//5132352F04DD7381FF50E3FEBEF2BC35 Everytime we will get new iD.
	
	//getWindowHandles()
	
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();//It opens anotgher browser window.//Child window.
	//driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	 Set<String> windowIDs= driver.getWindowHandles();//return ID'S of multiple browser  window.
	 
	 // First method By using iterator method
	 
/*	Iterator<String> it= windowIDs.iterator();
      String Parentwindowid=it.next();//It will give first browser window id. or we say Parent browser window id.
      String Childwindowid=it.next();//It will give child browser id.
      
      System.out.println("Parent window ID:"+Parentwindowid);
      System.out.println("Child window ID:"+Childwindowid);*/
	
	
//Second method
	 //By using List/ArrayList
	 
	 List<String> windowIDsList=new ArrayList(windowIDs);//converting Set to List.
	/*String parentWindowID= windowIDsList.get(0);//Parent window id.
	String ChildWindowID=windowIDsList.get(1);//Child window id.
	System.out.println("Parent window ID:"+parentWindowID);
    System.out.println("Child window ID:"+ChildWindowID);
    
    //tHESE ID ARE REQUIRED TO SWITCH BETWEEN ONE BROWSER WINDOW TO ANOTHER BROWSER WINDOW.
    
    //hOW TO USE WINDOW Id FOR SWITCHING PURPOSE. cURRENTLY OUR DRIVER FOCUS ON PARENT WINDOW. oNCE WE SWITCH 
    //OUR DRIVER FOCUS CHANGE TO CHILD WINDOW.
    
    driver.switchTo().window(parentWindowID);//This will switch to parent window.
    System.out.println("Parent window title:"+driver.getTitle());//This will give the parent window title.OrangeHRM
    
    driver.switchTo().window(ChildWindowID);//This will switch to Child window.
    System.out.println("Child window title:"+driver.getTitle());//This will give the Child window title.OrangeHRM HR Software | OrangeHRM*/
    
      
      
      
	//For each Loop	
	 
	 for(String winiid:windowIDsList)//From the windowid list first windowid i am storong in winid
		// and perform driver.switchTo().window(winiid).getTitle();it is switching to first windowid which is parentbrowser window and caoturing title.
		 //In second iteration it is gettinganother windowid and switch to that id and capturing the titlt. In the same way we can do for
		 //multiple browser window.
	 {
		 
		  // System.out.println(winiid);
		String title= driver.switchTo().window(winiid).getTitle();
		  System.out.println(title);
		   
	 }
	 
	 //close()
	// driver.close();//It will close single browser window. Our driver is pointing to second browser window that is child browser window.
	 //close single broswer window driver which pointing.
	 
	 
	 
	 //quit()
	//driver.quit();//Close both the browser Parent as well as child.Close all the browser window.
	
	
	
	//Close specific broswe by choice
	 for(String winiid:windowIDsList)
	 {
		 
		  // System.out.println(winiid);
		String title= driver.switchTo().window(winiid).getTitle();
		if(title.equals("OrangeHRM"))
		//if(title.equals("OrangeHRM")||title.equals("another title"))
		{
		driver.close();
		}
		 
		   
	 }
	
	 
		
		
		
		
		
		driver.manage().window().maximize();

	}

}
