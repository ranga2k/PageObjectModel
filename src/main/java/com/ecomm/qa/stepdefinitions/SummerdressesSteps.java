package com.ecomm.qa.stepdefinitions;

import com.ecomm.qa.base.TestBase;
import com.ecomm.qa.pages.DressesCategoryPage;

import cucumber.api.java.en.Given;

public class SummerdressesSteps extends TestBase{
	
	DressesCategoryPage categoryPage= new DressesCategoryPage();
	
	
	@Given("^user navigates to the site$")
	public void user_navigates_to_the_site() throws Throwable {
		TestBase.initialization();
	}

	@Given("^select \"([^\"]*)\" from the Dresses Tab$")
	public void select_from_the_Dresses_Tab(String arg1) throws Throwable {
		categoryPage.clickSummerDresses();
		categoryPage.clickSummerDressSubCategory();
	}

	@Given("^add an item to the cart and proceed checkout$")
	public void add_an_item_to_the_cart_and_proceed_checkout() throws Throwable {
	}

	@Given("^sign in using email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void sign_in_using_email_and_password(String arg1, String arg2) throws Throwable {
	}

}
