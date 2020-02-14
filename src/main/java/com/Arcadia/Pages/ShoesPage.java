package com.Arcadia.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Arcadia.Driverclass.BrowserFactory;

public class ShoesPage extends BrowserFactory  {
	
	BrowserFactory bf = new BrowserFactory();
	public ShoesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkShoesTitle()
	{
		bf.checkTitle(this.driver,"Shoes");
	}

}
