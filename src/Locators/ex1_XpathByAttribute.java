package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_XpathByAttribute 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	
	//enter UN
	//driver.findElement("Locator type")
	//driver.findElement(By.xpath("xpathExpression"));
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shruti");
	Thread.sleep(2000);
	
	//enter password
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcfhj");;
	Thread.sleep(2000);
	
	//click on login button
	driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	Thread.sleep(3000);
	
	//forgot account
	driver.findElement(By.xpath("//a[@class='_97w4']")).click();
	Thread.sleep(2000);
	
	//try again
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _9nq0 textPadding20px _4jy3 _4jy1 selected _51sy']")).click();
}
}
