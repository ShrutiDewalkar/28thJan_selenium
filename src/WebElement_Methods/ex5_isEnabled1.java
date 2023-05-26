package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_isEnabled1 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
//log in button of fb page	
	boolean result = driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
	System.out.println(result);
	
	if(result)
	{
		System.out.println("Element is enabled");
	}
	else
	{
		System.out.println("Element is disabled");
	}
}
}
