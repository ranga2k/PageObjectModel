package com.ecomm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ecomm.qa.base.TestBase;

public class DressesCategoryPage extends TestBase {

	@FindBy(xpath = "(//a[contains(text(),'Dresses')])[5]")
	WebElement Dresses;

	@FindBy(xpath = "//div[@id='subcategories']/ul/li[3]")
	WebElement SummerDresses;

	public DressesCategoryPage() {
		PageFactory.initElements(driver, DressesCategoryPage.class);
	}

	public void clickSummerDresses() {
		Dresses.click();
	}

	public void clickSummerDressSubCategory() {
		SummerDresses.click();
	}
}
