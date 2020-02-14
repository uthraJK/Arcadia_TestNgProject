package com.Arcadia.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Arcadia.Driverclass.BrowserFactory;

	public class BagsAccessoriesPage extends BrowserFactory  {
		
		BrowserFactory bf = new BrowserFactory();
		public BagsAccessoriesPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public void checkBagsAccessoriesTitle()
		{
			bf.checkTitle(this.driver,"Bags & Accessories");
		}


}
