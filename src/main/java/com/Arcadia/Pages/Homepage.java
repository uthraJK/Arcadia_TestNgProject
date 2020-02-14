package com.Arcadia.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Arcadia.Driverclass.BrowserFactory;

public class Homepage extends BrowserFactory {
	BrowserFactory bf = new BrowserFactory();

	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='AccountIcon-icon']")
	private WebElement loginIcon;

	@FindBy(xpath = "//div[@class='BrandLogo undefined']/img")
	private WebElement homePageLogo;
	
	@FindBy(xpath = "//a[@title='New In']")
	private WebElement categoryNewIn ;
	
	@FindBy(xpath = "//a[@title='Clothing']")
	private WebElement categoryClothing ;
	
	@FindBy(xpath = "//a[@title='Dresses']")
	private WebElement categoryDresses ;
	
	@FindBy(xpath = "//a[@title='Shoes']")
	private WebElement categoryShoes ;
	
	@FindBy(xpath = "//a[@title='Bags & Accessories']")
	private WebElement categoryBagsAccessories ;
	
	@FindBy(xpath = "//a[@title='Brands']")
	private WebElement categoryBrands;
	
	@FindBy(xpath = "//a[@title='Jeans']")
	private WebElement categoryJeans;
	
	@FindBy(xpath = "//a[@title='Sale']")
	private WebElement categorySale;
	
	@FindBy(xpath = "//input[@id='searchTermInput']")
	private WebElement searchTextBox;
	
	@FindBy(xpath = "//img[@class='SearchBar-icon']")
	private WebElement searchIcon;
	
		public Loginpage clickLoginIcon() {
		loginIcon.click();
		return new Loginpage();

	}
	public Homepage clickHomePageLogo() {
		homePageLogo.click();
		return new Homepage();

	}
	
	public NewInPage clickNewInPage()
	{
		categoryNewIn.click();
		
		return new NewInPage();
	}
	public ClothingPage clickCategoryClothing()
	{
		categoryClothing.click();
		return new ClothingPage();
	}

	public DressesPage clickCategoryDresses()
	{
		categoryDresses.click();
		return new DressesPage();
	}
	public ShoesPage clickCategoryShoes()
	{
		categoryShoes.click();
		return new ShoesPage();
	}

	public BagsAccessoriesPage clickCategoryBagsAccessories()
	{
		categoryBagsAccessories.click();
		return new BagsAccessoriesPage();
	}
	 	
	public BrandPage clickCategoryBrands()
	{
		categoryBrands.click();
		return new BrandPage();
	}
	public JeansPage clickCategoryJeans()
	{
		categoryJeans.click();
		return new JeansPage();
	}
	public SalePage clickCategorySale()
	{
		categorySale.click();
		return new SalePage();
	}

	

	
	
	
	

	
	

	
	
}
