package org.commonaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunction {
	
public static WebDriver driver;
	
	public static void launchBrowser(String url) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		waitforsometime(1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	public static void waitforsometime(int sec) throws InterruptedException
	{
		int s=sec*1000;
		Thread.sleep(s);
	}
	
	public static void submitButton(WebElement ele)
	{
		ele.click();
	}
	
	public static void insertText(WebElement ele,String text)
	{
		ele.sendKeys(text);
	}
	
	public void closebrowser()
	{
		driver.close();
	}
	

}
