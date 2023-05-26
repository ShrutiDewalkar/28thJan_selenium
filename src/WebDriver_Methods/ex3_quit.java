package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_quit 
{
public static void main(String[] args) 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.get("https://web.whatsapp.com/");
	
	driver.quit();//quit: to close the all the tabs present in browser

}
}
