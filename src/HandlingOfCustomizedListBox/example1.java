package HandlingOfCustomizedListBox;

import java.time.Duration;

import org.apache.xml.security.stax.ext.XMLSecurityConstants.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//in case select tagname is not present then customize the listbox
public class example1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //to page fully loaded
	//click on create new acc
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	//step=1
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	//step=2
	Actions act = new Actions(driver); //creating action object for perform method
	
	//step3
	act.click(month).perform();
	Thread.sleep(2000);
	
	//step4A: navigate 1 option to top using "Arrow_up" key
	act.sendKeys(Keys.ARROW_UP).perform(); //perform method of action class
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	
	//step4A: navigate 1 option to bottom using "buttom_up" key
	act.sendKeys(Keys.ARROW_DOWN).perform();
	
	//select option using enter key
	act.sendKeys(Keys.ENTER).perform();
}
}
