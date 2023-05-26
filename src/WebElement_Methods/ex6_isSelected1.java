package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_isSelected1
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//click on create new link
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	//female radio button
	boolean result = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
	System.out.println(result);
	
	if(result)
	{
		System.out.println("button is selectedd");
	}
	else
	{
		System.out.println("Button is not selected ");
	}
}
}
