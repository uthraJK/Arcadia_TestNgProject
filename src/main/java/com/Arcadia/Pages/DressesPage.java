package com.Arcadia.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Arcadia.Driverclass.BrowserFactory;

public class DressesPage extends BrowserFactory 
{
	BrowserFactory bf = new BrowserFactory();
	public DressesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkDressesTitle()
	{
		bf.checkTitle(this.driver,"Dresses");
	}

}
