package com.ecomm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="passwd")
	WebElement passwd;

	@FindBy(xpath="//*[@id='SubmitLogin']/span/text()")
	WebElement submitBtn;
	
	@FindBy(xpath="//img[contains(@class,logo img-responsive)]")
	WebElement ecomLogo;

    public LoginPage()
    {
	PageFactory.initElements(driver,LoginPage.class);
}
    
    public String validateLoginPageTitle()
    {
    	return driver.getTitle();
    }
    
    public boolean validateecomLogo()
    {
    	return ecomLogo.isDisplayed();
    }
    
    public MyAccountPage login(String username,String password)
    {
    	email.sendKeys(username);
    	passwd.sendKeys(password);
    	JavascriptExecutor js =(JavascriptExecutor)driver;
    	js.executeAsyncScript("arguments[0].click();",submitBtn);
    	return new MyAccountPage();
    }
	
}
