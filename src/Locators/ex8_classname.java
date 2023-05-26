package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_classname 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.get("file:///E:/SOFTWARE%20TESTING/28thJan_Selenium_Software/HTML%20NOTES/Tagname_locator.html");
	
	//enter un
	driver.findElement(By.className("abs123")).sendKeys("Velocity");
	
	//enter LN
		driver.findElement(By.className("abs123")).sendKeys("Velocity");
	
}
}
