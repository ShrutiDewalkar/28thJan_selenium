package HandlingofMultipleElements;
//how to find multiple elements using findelements//list of webelement - returntype
//use for different inputs
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//text ahe tithe gettext call kara 
public class ex1_printALLLinksfromWebpage
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	//multiple matching xpath//a --> a only for link 
	List<WebElement> allLinks = driver.findElements(By.xpath("//a")); //coll list =
	
	System.out.println(allLinks.size());
	
	//for each loop
	for(WebElement s1: allLinks )   //no incer or dec no start or end index
	{
		System.out.println(s1.getText());
	}
}
}
 