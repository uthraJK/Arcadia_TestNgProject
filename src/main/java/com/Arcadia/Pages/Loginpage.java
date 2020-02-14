package com.Arcadia.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Arcadia.Driverclass.BrowserFactory;
import com.Arcadia.Utility.BaseClass;

public class Loginpage extends BrowserFactory {
	
	BrowserFactory bf = new BrowserFactory();

	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath ="//input[@id='Login-email']")
private WebElement loginEmailId;

@FindBy(xpath ="//input[@id='Login-password']")
private WebElement loginPassword;
	
@FindBy(xpath ="//form[@class='Login-form']/button")
private WebElement signIn;	
	
@FindBy(xpath ="//input[@id='Register-email']")
private WebElement registerEmailId;

@FindBy(xpath ="//input[@id='Register-password']")
private WebElement registerPassword;
	
@FindBy(xpath ="//input[@id='passwordConfirm-password']")
private WebElement registerPasswordConfirm;

@FindBy(xpath ="//button[@class='Button Register-saveChanges is-active']")
private WebElement registerButton;

@FindBy(xpath ="//label[@class='FormComponent-subscribe Checkbox CheckboxName-subscribe Checkbox-subscription']/span/span")
private WebElement signUpCheckBox;

@FindBy(xpath="//div[@class='Accordion-icon Accordion-icon--primary Accordion-icon--left']")
private WebElement forgotPassword;

@FindBy(xpath="//input[@id='email-email']")
private WebElement forgotpasswordEmail;

@FindBy(xpath = "//span[@id='email-error']")
private WebElement loginEmailError;

@FindBy(xpath = "//span[@id='password-error']")
private WebElement loginPasswordError;

@FindBy(xpath = "//span[@id='passwordConfirm-error']")
private WebElement registerConfirmPasswordError;

@FindBy(xpath="//div[@class='Message is-shown is-error ']/p")
private WebElement registerEmailExistError;

public AccountPage login(String emailId,String pwd)
{
bf.setText(loginEmailId,emailId);
bf.setText(loginPassword,pwd);

signIn.click();
return new AccountPage();

}
public void LoginErrorMessageWithoutFieldValue()
{
	signIn.click();
	String emailError = bf.getText(loginEmailError);
	String passwordError = bf.getText(loginPasswordError);
	Assert.assertTrue(emailError.equalsIgnoreCase("An email address is required."));
	Assert.assertTrue(passwordError.equalsIgnoreCase("A password is required."));
}
public void LoginErrorMessageWithoutEmailValue(String pwd)
{
	bf.setText(loginPassword,pwd);
	signIn.click();
	String emailError =  bf.getText(loginEmailError); 
	Assert.assertTrue(emailError.equalsIgnoreCase("An email address is required."));
}
public void LoginErrorMessageWithoutPasswordValue(String emailId)
{
	bf.setText(loginEmailId,emailId);
	signIn.click();
	String passwordError = bf.getText(loginPasswordError); 
	Assert.assertTrue(passwordError.equalsIgnoreCase("A password is required."));
}
public void registerErrorMessagePasswordMismatch(String registerPwd,String registerConfirmPwd)
{
	try
	{
		if(registerPwd.equals(registerConfirmPwd))
		{
			String confirmPasswordError = bf.getText(registerConfirmPasswordError);
			Assert.assertTrue(confirmPasswordError.equalsIgnoreCase("Please ensure that both passwords match"));
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}}

public void registerErrorMessageWithoutPasswordValue(String registerEmail)
{
bf.setText(registerEmailId,registerEmail);
registerPasswordConfirm.click();
}
public void registerErrorMessageExistingEmailId(String registerEmail,String registerPwd,String registerConfirmPwd)
{
bf.setText(registerEmailId,registerEmail);
bf.setText(registerPassword,registerPwd);
bf.setText(registerPasswordConfirm,registerConfirmPwd);
registerButton.click();
String registerExistingEmailError =  bf.getText(registerEmailExistError);
Assert.assertTrue(registerExistingEmailError.equalsIgnoreCase("Sorry you are unable to register with this email address. Please use a different email address and try again." ));
}


public AccountPage register(String registerEmail,String registerPwd,String registerConfirmPwd) throws Exception
{
 bf.setText(registerEmailId,registerEmail);
 bf.setText(registerPassword,registerPwd);
 bf.setText(registerPasswordConfirm,registerConfirmPwd);
registerButton.click();
Thread.sleep(7000);
return new AccountPage();

}

}
