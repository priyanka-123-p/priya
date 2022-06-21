package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinpage 
{
	@FindBy(xpath ="//input[@type='password']") private WebElement pin;
	@FindBy(xpath= "//button[@type='submit']") private WebElement submit;
	@FindBy(xpath= "//a[text()='Forgot 2FA?']") private  WebElement forgot;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signup;
	
	public ZerodhaPinpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterpin(String pinNumber)
    {
		pin.sendKeys(pinNumber);
    }
	public void ClickOnContinue()
	{
		submit.click();
	}
	public void ClickOnForgot()
	{
		forgot.click();
	}
	public void ClickOnSignup()
	{
		signup.click();
	}
}
