package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import Utility.Parameterized2;

public class ZerodhaLoginPageTest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void browser()
	{
		driver= Browser.openbrowser("https://kite.zerodha.com/");
	}
	
	@Test
	public void LoginWithValidCredintialsTest() throws EncryptedDocumentException, IOException 
	{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		
		String username = Parameterized2.getdata(0, 1);
		String password = Parameterized2.getdata(1, 1);
		zerodhaLoginPage.EnterUserId(username);
		zerodhaLoginPage.EnterPassword(password);
		zerodhaLoginPage.ClickOnLogin();
	}
	@Test
	public void LoginWithoutPasswordTest() throws EncryptedDocumentException, IOException
	{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.ClickOnLogin();
		//  String text= zerodhaLoginPage.geterrortext();
		 
		String username = Parameterized2.getdata(0, 1);
		zerodhaLoginPage.EnterUserId(username);
		zerodhaLoginPage.ClickOnLogin();
		
		
	
	}
}
