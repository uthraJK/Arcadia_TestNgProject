package com.Arcadia.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Arcadia.Driverclass.BrowserFactory;

public class ClothingPage extends BrowserFactory{
	
	BrowserFactory bf = new BrowserFactory();
	public ClothingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkClothingTitle()
	{
		bf.checkTitle(this.driver,"Clothing" );
	}

}
