package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinpage;
import Utility.Parameterized2;

public class ZerodhaPinPageTest 
{
	WebDriver driver;
	@BeforeTest
	public void browser() throws EncryptedDocumentException, IOException
	{
		driver = Browser.openbrowser("https://kite.zerodha.com/");
		
	}
	
	@Test
	public void entercorretpin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		
		String username = Parameterized2.getdata(0, 1);
		String password = Parameterized2.getdata(1, 1);
		
		zerodhaLoginPage.EnterUserId(username);
		zerodhaLoginPage.EnterPassword(password);
		zerodhaLoginPage.ClickOnLogin();
		
		Thread.sleep(2000);
		ZerodhaPinpage zerodhaPinPage = new ZerodhaPinpage(driver);
		
		String pin = Parameterized2.getdata(2, 1);
		zerodhaPinPage.enterpin(pin);
		zerodhaPinPage.ClickOnContinue();
		
	}

	
}
