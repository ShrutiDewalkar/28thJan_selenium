package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex11_PartialLinktext 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.get("file:///E:/SOFTWARE%20TESTING/28thJan_Selenium_Software/HTML%20NOTES/PartialLinktext.html");
	
Thread.sleep(2000);
//click on facebook link

driver.findElement(By.partialLinkText("ebo")).click();
}
}
