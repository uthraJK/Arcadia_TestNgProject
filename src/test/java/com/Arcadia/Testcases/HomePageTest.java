package com.Arcadia.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Arcadia.Driverclass.BrowserFactory;
import com.Arcadia.Pages.AccountPage;
import com.Arcadia.Pages.BagsAccessoriesPage;
import com.Arcadia.Pages.BrandPage;
import com.Arcadia.Pages.ClothingPage;
import com.Arcadia.Pages.DressesPage;
import com.Arcadia.Pages.Homepage;
import com.Arcadia.Pages.JeansPage;
import com.Arcadia.Pages.Loginpage;
import com.Arcadia.Pages.NewInPage;
import com.Arcadia.Pages.SalePage;
import com.Arcadia.Pages.ShoesPage;

public class HomePageTest extends BrowserFactory {
	
	BrowserFactory bf = new BrowserFactory();

	Homepage homepage;
	NewInPage newinpage;
	ClothingPage clothingpage;
	DressesPage dressespage;
	ShoesPage shoespage;
	BagsAccessoriesPage bagsaccessoriespage;
	BrandPage brandpage;
	JeansPage jeanspage;
	SalePage salepage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		System.out.println("Before Class is running ");
		initialization();
		homepage = new Homepage();
		System.out.println("Before Method is running");
		homepage.clickLoginIcon();

	}

	@Test
	public void navigateToNewIn() throws Exception {
		newinpage = homepage.clickNewInPage();
		Thread.sleep(7000);
		System.out.println("1" +driver.getTitle());
		newinpage.checkNewInTitle();
		System.out.println("123");
		
	}

	@Test
	public void navigateToCategoryClothing() throws Exception {
		clothingpage = homepage.clickCategoryClothing();
		Thread.sleep(7000);
		clothingpage.checkClothingTitle();
	}

	@Test
	public void navigateToCategoryDresses() throws Exception {
		dressespage = homepage.clickCategoryDresses();
		Thread.sleep(7000);
		dressespage.checkDressesTitle();
	}

	@Test
	public void navigateToCategoryShoes() throws Exception {
		shoespage = homepage.clickCategoryShoes();
		Thread.sleep(7000);
		shoespage.checkShoesTitle();
	}

	@Test
	public void navigateToCategoryBagsAccessories() throws Exception {
		bagsaccessoriespage = homepage.clickCategoryBagsAccessories();
		Thread.sleep(7000);
		bagsaccessoriespage.checkBagsAccessoriesTitle();
	}

	@Test
	public void navigateToCategoryBrands() throws Exception {
		brandpage = homepage.clickCategoryBrands();
		Thread.sleep(7000);
		brandpage.checkBrandTitle();
	}

	@Test
	public void navigateToCategoryJeans() throws Exception {
		jeanspage = homepage.clickCategoryJeans();
		Thread.sleep(7000);
		jeanspage.checkJeansTitle();
	}

	@Test
	public void navigateToCategorySale() throws Exception
	{
		salepage = homepage.clickCategorySale();
		Thread.sleep(7000);
		salepage.checkSaleTitle();
	}
	
	@AfterMethod
	public void tearDown()
		{

			homepage.clickHomePageLogo();
			System.out.println(driver.getTitle());
			System.out.println("aftr method is running ");
			driver.quit();
		}
}