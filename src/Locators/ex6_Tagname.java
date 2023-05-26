package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Tagname locator (finding only tags from webpage)
public class ex6_Tagname 
{
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.get("file:///E:/SOFTWARE%20TESTING/28thJan_Selenium_Software/HTML%20NOTES/Tagname_locator.html");
	
	//enter un
	driver.findElement(By.tagName("input")).sendKeys("abs");
	
	//enter sr
	driver.findElement(By.tagName("input")).sendKeys("little");
}
}
