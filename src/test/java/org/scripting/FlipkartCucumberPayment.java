package org.scripting;

import org.commonaction.CommonFunction;
import org.locator.Locatorss;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartCucumberPayment extends CommonFunction{


	Locatorss lo = new Locatorss();
	CommonFunction ca= new CommonFunction();
	
	@Given("Launch browser")
	public void launch_browser() {

	}

	@And("user enter credentials for flipkart {string},{string}")//scenario outline
	public void user_emter_credentials_for_flipkart(String uname, String pwd) {
		ca.insertText(lo.getUsername(), uname);
	}
	
	
	@And("user emter credentials for flipkart {string}") //sceanrio
	public void user_emter_credentials_for_flipkart(String uuname) throws InterruptedException {
		ca.waitforsometime(10);
		ca.insertText(lo.getUsername(), uuname);

	}
	
	@And("user emter credentials for flipkart")
	public void user_emter_credentials_for_flipkart() {
		ca.insertText(lo.getUsername(), "yuvarajsrec4@gmail.com"); //hardcode - code - data
	}

	@When("user click login button")
	public void user_click_login_button() {	  
	}

	@And("validate user screen")
	public void validate_user_screen() {

	}

	@And("iser selects an items by searching")
	public void iser_selects_an_items_by_searching() {

	}

	@Then("go to payment screen")
	public void go_to_payment_screen() {

	}

	@Then("validate the text and screenshot")
	public void validate_the_text_and_screenshot() {

	}

	@But("user shouldnot see the gotocart screen")
	public void user_shouldnot_see_the_gotocart_screen() {

	}


	
}
