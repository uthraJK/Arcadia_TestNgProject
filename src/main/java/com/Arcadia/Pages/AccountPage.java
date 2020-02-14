package com.Arcadia.Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Arcadia.Driverclass.BrowserFactory;

public class AccountPage extends BrowserFactory{

	
	public AccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void checkTitle()
	{
		
		String acctitle = driver.getTitle();
		System.out.println(acctitle);
		Assert.assertTrue(acctitle.contains("My account"));
	}	
	
	
	
	
	
	
}
