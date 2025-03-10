package com.e2e.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.e2e.base.BaseClass;
import com.e2e.pages.HomePage;
import com.e2e.pages.LoginPage;

public class LoginPageTest extends BaseClass{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=0)
	public void validateLoginPageTest()
	{
		String loginPageTitle = loginPage.verifyPageTitle();
		Assert.assertEquals(loginPageTitle, "Swag Labs");
	}
	@Test(priority=1)
	public void validateLoginTest()
	{
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		String homePageURL = homePage.verifyHomePageUrl();
		Assert.assertEquals(homePageURL, "https://www.saucedemo.com/inventory.html");
	}
	
	@AfterMethod
	public void closure()
	{
		driver.quit();
	}

}
