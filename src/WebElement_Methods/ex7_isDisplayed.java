package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex7_isDisplayed
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(5000);
	
	//click on FB logo
	boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	System.out.println(result);
	
	if(result)
	{
		System.out.println("Logo is present");
	}
	else 
	{
		System.out.println("Logo is not present");
	}
}
}
