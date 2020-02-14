package com.Arcadia.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Arcadia.Driverclass.BrowserFactory;

public class JeansPage extends BrowserFactory {
	
	BrowserFactory bf = new BrowserFactory();
	public JeansPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkJeansTitle()
	{
		bf.checkTitle(this.driver,"Jeans" );
	}

}
