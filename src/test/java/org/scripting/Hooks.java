package org.scripting;

import org.commonaction.CommonFunction;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonFunction{
	
	CommonFunction ca= new CommonFunction();
	String url="https://www.flipkart.com/";
	
	@Before
	public void beforeAnnotation() throws InterruptedException
	{
		ca.launchBrowser(url);
	}

	@After
	public void afterAnnotation()
	{
		ca.closebrowser();
	}
}
