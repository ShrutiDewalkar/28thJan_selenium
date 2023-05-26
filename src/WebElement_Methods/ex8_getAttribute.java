package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_getAttribute 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shrutiiii");
	Thread.sleep(4000);
	
	String text = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
	System.out.println(text);
}
}
