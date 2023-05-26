package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_sendkeys 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shruti");
	
	WebElement UN = driver.findElement(By.xpath("//input[@id='email']")); //upto here we find address and create vatiable/object as webelement
	UN.sendKeys("xyz");  //object/variable name.webelement method name
	
}
}


//return type:method name