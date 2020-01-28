package com.ecomm.qa.stepdefinitions;


import com.ecomm.qa.base.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class loginStep extends TestBase{
	
	
	@Given("^user opens the browser$")
	public void user_opens_the_browser() throws Throwable {
		TestBase.initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^myaccount page is displayed$")
	public void myaccount_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^validate the myaccount title$")
	public void validate_the_myaccount_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}


}
