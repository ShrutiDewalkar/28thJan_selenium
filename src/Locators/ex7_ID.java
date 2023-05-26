package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex7_ID 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/SOFTWARE%20TESTING/28thJan_Selenium_Software/HTML%20NOTES/Tagname_locator.html");
		
		//enter un
		driver.findElement(By.id("1234")).sendKeys("suraj");
		
		//enter LN
		driver.findElement(By.id("1234")).sendKeys("Dewalkar");
}
}