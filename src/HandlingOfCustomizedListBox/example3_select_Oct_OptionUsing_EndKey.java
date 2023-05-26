package HandlingOfCustomizedListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example3_select_Oct_OptionUsing_EndKey
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//click on create new acc
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	//step=1
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));//select month opton
	
	//step2
	Actions act = new Actions(driver);
	
	//step3
	act.click(month).perform();
	Thread.sleep(2000);
	
	//navigate to end key
	act.sendKeys(Keys.END).perform();//jump to end
	Thread.sleep(2000);
	
	//navigate to Aug using arrow -up
	for(int i =1;i<=4;i++)
	{
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
	}
	
	//click on enter key
	act.sendKeys(Keys.ENTER).perform();
}
}
