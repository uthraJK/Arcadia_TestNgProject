package com.Arcadia.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Arcadia.Driverclass.BrowserFactory;

public class NewInPage extends BrowserFactory {
	
	BrowserFactory bf = new BrowserFactory();
	public NewInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkNewInTitle()
	{
		bf.checkTitle(this.driver,"New In");
	}


}
