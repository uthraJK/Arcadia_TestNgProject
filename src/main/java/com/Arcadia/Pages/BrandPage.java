package com.Arcadia.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Arcadia.Driverclass.BrowserFactory;


	public class BrandPage extends BrowserFactory  {
		
		BrowserFactory bf = new BrowserFactory();
		public BrandPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public void checkBrandTitle()
		{
			bf.checkTitle(this.driver,"Brand");
		}

}
