package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex12_instagramLogin 
{
public static void main(String[] args) 
{
WebDriver driver = new ChromeDriver();
driver.get("https://www.instagram.com/");

driver.manage().window().maximize();

//enter un
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shruti");

//enter LN
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Thengne");
}
}
