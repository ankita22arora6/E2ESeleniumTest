package com.e2e.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.e2e.base.BaseClass;



public class LoginPage extends BaseClass {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//WebElements of LoginPage
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement txt_UserName;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement txt_Password;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement btn_Login;
	
	
	//Methods on LoginPage
	
	public String verifyPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage Login(String un, String pswd)
	{
		txt_UserName.sendKeys(un);
		txt_Password.sendKeys(pswd);
		
		btn_Login.click();
		
		return new HomePage();
	}
	

}
