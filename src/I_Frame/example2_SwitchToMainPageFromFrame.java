package I_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_SwitchToMainPageFromFrame 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

//switch to frame
driver.switchTo().frame("iframeResult");
////click on "click me btn" from iframe
driver.findElement(By.xpath("//button[@type='button']")).click();

//switch to main page again
//driver.switchTo().parentFrame();//parent frame goes immediate to previous window framei.e,2<<1
driver.switchTo().defaultContent();//default moves to main frame
Thread.sleep(2000);

//click on "open menu" option from main page
driver.findElement(By.xpath("//a[@id='menuButton']")).click();


}
}
