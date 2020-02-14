package com.Arcadia.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Arcadia.Driverclass.BrowserFactory;

public class SalePage extends BrowserFactory {
	
	BrowserFactory bf = new BrowserFactory();
	public SalePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkSaleTitle()
	{
		bf.checkTitle(this.driver,"Sale" );
	} 
	

}
