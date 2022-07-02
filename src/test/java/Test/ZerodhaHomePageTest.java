package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaHomePage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinpage;
import Utility.Parameterized2;

public class ZerodhaHomePageTest
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
		
		ZerodhaHomePage zerodhahomepage = new ZerodhaHomePage(driver);
		
		//zerodhahomepage.inputtosearch("SPRL");
		
		//zerodhahomepage.Clikonwatchliststock(driver);
		zerodhahomepage.inputtosearch();
		
		zerodhahomepage.addstocktowatchlist(driver);
	}
	@Test
	public void demo()
	{
		System.out.println("hiii");
	}
	@Test
	public void demo2()
	{
		System.out.println("new test added recently...");
	}
}
