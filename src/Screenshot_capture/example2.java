package Screenshot_capture;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;
//we randomly add testcase id
public class example2 
{
public static void main(String[] args) throws IOException 
{
	WebDriver driver = new ChromeDriver();//convert webdriver object into take ss interface
    driver.get("https://www.facebook.com/login/");
    //generate random string
    String RS = RandomString.make(2);//class//make-static method//leght pathvnar varaible mdhe store krnar
    System.out.println(RS);//combine with image name
    
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	
	//create a destination file path
	File dest = new File("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\A Selenium Notes\\capture SCREENSHOT Example\\ex_1"+RS+".jpg");
	

	org.openqa.selenium.io.FileHandler.copy(src, dest); //classname.methodname
}
}
