package com.ecomm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomm.qa.base.TestBase;

public class MyAccountPage extends TestBase {
	
	@FindBy(xpath="//*[@id='columns']/div[1]/span[2]")
	WebElement myAccountText;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	WebElement header_Womentab;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	WebElement header_dresstab;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	WebElement header_tshirtstab;
	
	@FindBy(xpath="//*[@id='center_column']/div/div[1]/ul/li[1]/a/span")
	WebElement order_history_tab;
	
	@FindBy(xpath="//*[@id='center_column']/div/div[2]/ul/li/a/span")
	WebElement mywishlist_tab;
	
public MyAccountPage()
{
	PageFactory.initElements(driver, MyAccountPage.class);
}

public String validatemyAccountPageTitle()
{
	return driver.getTitle();
} 
	
public String validate_header_Womentab_Title()
{
	return driver.getTitle();
} 

public String validate_header_dresstab_Title()
{
	return driver.getTitle();
} 

public String validate_header_tshirtstab_Title()
{
	return driver.getTitle();
} 
}
