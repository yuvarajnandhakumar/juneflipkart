package org.scripting;

import java.util.concurrent.TimeUnit;

import org.commonaction.CommonFunction;
import org.locator.Locatorss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.corba.se.spi.activation.Locator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartPayment extends CommonFunction{

	Locatorss lo = new Locatorss();

	public void login()
	{
		submitButton(lo.getClosebtn());
		insertText(lo.getUsername(), "yuvarajsrec4@gmail.com");
	}
	public void searchItems()
	{
		//redmi
	}
	public void getResultOutput()
	{
		//20 product name -> list /array
	}

	public void selectOneProduct()
	{

	}
	public void addToCart()
	{

	}

	public void goToPaymentScreen()
	{

	}
	public void TakePic()
	{

	}
	public void closeBrowser()
	{

	}

	public static void main(String[] args) throws InterruptedException {

		FlipkartPayment f = new FlipkartPayment();
		f.launchBrowser("https://www.flipkart.com/");
		f.login();

	}

}
