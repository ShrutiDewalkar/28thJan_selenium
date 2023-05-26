package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//xpath by using contins attribute
public class ex4_XpathByContainsUsingAttribute
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//Enter UN
	driver.findElement(By.xpath("//input[contains (@placeholder,'phone number')]")).sendKeys("shruti");
	
	//enter pwd
	driver.findElement(By.xpath("//input[contains (@id,'pass')]")).sendKeys("Dewalksa");
	
	//click on login button
	driver.findElement(By.xpath("//button[contains (@class,'selected _51sy')]")).click();
}
}
