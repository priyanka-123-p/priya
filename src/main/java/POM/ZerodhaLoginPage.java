package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage
{
	@FindBy(xpath = "//input[@id='userid']") private WebElement userid;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement login;
	@FindBy(xpath = "//a[text()= 'Forgot user ID or password?']") private WebElement  forgot;
	@FindBy(xpath = "//a[text()= \"Don't have an account? Signup now!\"]") private WebElement  signup;
	@FindBy(xpath = "//span[text()='User ID should be minimum 6 characters.']") private WebElement useriderror;
	
	//span[text()='User ID should be minimum 6 characters.']
	
	
	public ZerodhaLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserId(String id)
	{
		userid.sendKeys(id);
	}
	
	public void EnterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void ClickOnLogin()
	{
		login.click();
	}
	
	public void ClickOnForgot()
	{
		forgot.click();
		
	}
	
	public void ClickOnSignup()
	{
		signup.click();
	}
	//public String geterrortext()
	//{
		//useriderror.click();
		//return 
	//}
}
