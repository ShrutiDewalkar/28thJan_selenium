package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_getText 
{
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
//return type= string of gettext method 
	String text	=driver.findElement(By.xpath("xpath(\"//a[text()='Forgotten password?']")).getText();
	System.out.println(text); //printing statement
	
	//System.out.println(driver.findElement(By.xpath("xpath(\"//a[text()='Forgotten password?']")).getText());
	
}
}
