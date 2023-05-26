package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_get 
{
public static void main(String[] args) 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");//get- to enter url in browser or to open an application.
}
}
