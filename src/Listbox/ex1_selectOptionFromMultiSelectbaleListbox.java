package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1_selectOptionFromMultiSelectbaleListbox 
{
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.get("file:///E:/SOFTWARE%20TESTING/28thJan_Selenium_Software/HTML%20NOTES/sample4.html");
	
	WebElement selectcountry =driver.findElement(By.xpath("//select[@id='1234']"));
	
	Select s = new Select(selectcountry);
	
	//s.selectByIndex(2);
	s.selectByValue("Japan");
	//s.selectByVisibleText("");
} 
}
