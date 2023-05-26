package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_Alertpopup2 //confirmation popup
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//switch to alert popup
		Alert alt = driver.switchTo().alert(); //multiple time object resuse
		
		//1:getText from alert popup
		String text = alt.getText();
		System.out.println(text);
		
		//2:click on 'cancel' button from alert popup
		alt.dismiss();//work for cancel button
		//focus from main page to alert popup
		
		//3:click on 'OK' button from 1st alert popup
		alt.accept();
		
		Thread.sleep(4000);
		
		//4:click on 'OK' button from 2nd alert popup
		alt.accept();
}
}