package Screenshot_capture;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//use as fail test case as a screen shot --> how to capture SS using selenium webdriver //imp ques
public class example1 
{
public static void main(String[] args) throws IOException 
{
       WebDriver driver = new ChromeDriver();//convert webdriver object into take ss interface
       driver.get("https://www.facebook.com/login/");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	//covert-->interface downcasting//typecaste
	//getss - method of take ss interface//ss capture in local memory
	
	//create a destination file path
	File dest = new File("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\A Selenium Notes\\capture SCREENSHOT Example\\ex_1.jpg");
	//store as string path in dest path and decide a image format line png,jpg
	//cut & paste in dstpath->using inbuilt class i.e,filehandler

	org.openqa.selenium.io.FileHandler.copy(src, dest); //classname.methodname
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
