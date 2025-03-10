package com.e2e.pages;

import org.openqa.selenium.support.PageFactory;

import com.e2e.base.BaseClass;

public class HomePage extends BaseClass{
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	public String verifyHomePageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	

}
