package org.locator;

import org.commonaction.CommonFunction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locatorss extends CommonFunction{

	public Locatorss() 
	{	
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement closebtn;

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getClosebtn() {
		return closebtn;
	}
	
	
	
}
