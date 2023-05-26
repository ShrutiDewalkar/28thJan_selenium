package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_getTitle 
{
public static void main(String[] args) 
{
WebDriver driver= new ChromeDriver();
driver.get("https://support.google.com/mail/answer/8494?hl=en&co=GENIE.Platform%3DDesktop");

String title =driver.getTitle();
System.out.println(title);
}
}
//getTitle: this method is use to get title of a webpage. return type of getTitle method is String.