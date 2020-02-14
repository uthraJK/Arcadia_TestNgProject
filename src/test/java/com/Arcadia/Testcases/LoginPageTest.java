package com.Arcadia.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Arcadia.Driverclass.BrowserFactory;
import com.Arcadia.Pages.AccountPage;
import com.Arcadia.Pages.Homepage;
import com.Arcadia.Pages.Loginpage;

public class LoginPageTest extends BrowserFactory {
	BrowserFactory bf = new BrowserFactory();
	AccountPage accountpage;
	Loginpage loginpage;
	Homepage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		System.out.println("Before Class is running ");
		initialization();
		homepage = new Homepage();
		loginpage = new Loginpage();
		accountpage = new AccountPage();
		System.out.println("Before Method is running");
		homepage.clickLoginIcon();

	}

	@Test
	public void loginPage() throws InterruptedException {
		System.out.println(" test 1  is running ");
		loginpage.login(prop.getProperty("emailID"), prop.getProperty("password"));
		Thread.sleep(9000);
		System.out.println(driver.getTitle());
		System.out.println("1");
		accountpage.checkTitle();
	}

	@Test
	public void validateLoginErrorMsgwithoutValues() throws Exception {
		System.out.println("test 2 is running");
		loginpage.LoginErrorMessageWithoutFieldValue();
		System.out.println("2");
	}

	@Test
	public void validateLoginErrorMsgwithoutEmailValue() throws Exception {
		System.out.println("test 3 is running");
		loginpage.LoginErrorMessageWithoutEmailValue(prop.getProperty("password"));
		System.out.println("3");
	}

	@Test
	public void validateLoginErrorMsgwithoutPasswordValue() throws Exception {
		System.out.println("test 4 is running");
		loginpage.LoginErrorMessageWithoutPasswordValue(prop.getProperty("emailID"));

	}
	
	@Test
	public void validateRegisterErrorMessagePasswordMismatch()
	{
		loginpage.registerErrorMessagePasswordMismatch( prop.getProperty("registerpassword") , prop.getProperty("registerconfirmpassword"));
		
		
	}
	@Test
	public void validateRegisterErrorMessageWithoutPasswordValue() 
	{
		loginpage.registerErrorMessageWithoutPasswordValue(bf.random(prop.getProperty("registeremail")));
		
		
	}

	@Test
	public void validateRegisterErrorMessageExistingEmailId() 
	{
		loginpage.registerErrorMessageExistingEmailId(prop.getProperty("registeremail"),prop.getProperty("registerpassword") , prop.getProperty("registerconfirmpassword"));
		
		
	}

	@Test
	public void register() throws Exception 
	{
		loginpage.register(bf.random(prop.getProperty("registeremail")), prop.getProperty("registerpassword") , prop.getProperty("registerconfirmpassword"));
		accountpage.checkTitle();
		
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

