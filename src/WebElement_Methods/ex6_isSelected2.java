package WebElement_Methods;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_isSelected2 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//click on create new link
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(3000);
	
	//click on radio female button--> creating object and click 
	WebElement femaleradiobtn = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
	femaleradiobtn.click(); //objectname.methodname
	
	boolean result = femaleradiobtn.isSelected();
	System.out.println(result);
	
	if(result)
	{
		System.out.println("Radio button selected");
	}
else
{
	System.out.println("Radio button not selected");
}
}
}
