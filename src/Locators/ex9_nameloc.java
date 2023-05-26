package Locators;
//webelement -- interface
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex9_nameloc 
{
	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
driver.get("file:///E:/SOFTWARE%20TESTING/28thJan_Selenium_Software/HTML%20NOTES/Tagname_locator.html");

//un
driver.findElement(By.name("xyz123")).sendKeys("shruti");

//ln
driver.findElement(By.name("xyz123")).sendKeys("shruti");

	}
}
