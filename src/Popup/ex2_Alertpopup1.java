package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//alert--interface
public class ex2_Alertpopup1 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("100");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	//1:getText from alert popup
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
	
	//2:click on 'cancel' button from alert popup
	//driver.switchTo().alert().dismiss();//work for cancel button
	//focus from main page to alert popup
	
	Thread.sleep(3000);
	
	//3:click on 'OK' button from 1st alert popup
	driver.switchTo().alert().accept();
	
	//4:click on 'OK' button from 2nd alert popup
	driver.switchTo().alert().accept();
}
}
