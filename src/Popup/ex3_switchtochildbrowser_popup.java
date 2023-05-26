package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_switchtochildbrowser_popup 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//click on "NewTab" from main page
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	
	//get child window ID
	 Set<String> allids = driver.getWindowHandles(); //{mainPageID, childWindowID}
	 ArrayList<String> al=new ArrayList<>(allids);//all data store in arraylist
	 String childwindowID = al.get(1);
	 System.out.println(childwindowID);
	 
	//1st switch to child window
	 driver.switchTo().window("childwindowID");  //string childwindowID//id get by method
	
     //click on training link from childwindow
	driver.findElement(By.xpath("//span[text()='Training'])[1]")).click();
}
}
