package HandlingOfAutoSuggestions;

import java.rmi.activation.ActivateFailedException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("redmi");
	Thread.sleep(3000);
	
	List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	
	String expectedtext = "redmi note 9 pro"; //string to hightlight the expected result
	
	for(WebElement s1:alloptions) //loop run for all options
	{
		String ActText = s1.getText();
      
		if(ActText.equals(expectedtext)) //find expected then loop break or continue
	{
		s1.click();
		break;
	}
}
}
}
