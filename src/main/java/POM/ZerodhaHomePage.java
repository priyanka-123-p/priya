package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage 
{
	@FindBy(xpath= "//input[@type='text']") private WebElement search;
	@FindBy(xpath= "//span[@class='nice-name']") private List<WebElement> watchlist;
	@FindBy(xpath="//span[@class='tradingsymbol']") private List<WebElement> searchlist;
	//@FindBy(xpath="//button[@data-balloon='Add']") private WebElement add;
	@FindBy(xpath= "//button[@class='button-blue buy']") private WebElement buystock;
	

	
	public ZerodhaHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inputtosearch()
	{
		search.click();
	}
	
	public void addstocktowatchlist(WebDriver driver)
	{
		int number = searchlist.size();
		for(int i=0;i<number;i++)
		{
			WebElement list= searchlist.get(i);
			String liststock = list.getText();
			System.out.println(liststock);
			
		}
	}
	public void Clikonwatchliststock(WebDriver driver)
	{
		int count= watchlist.size();
		//System.out.println(count);
		
		for(int i=0; i<count;i++)
		{
			WebElement stock = watchlist.get(i);
			String stocktext= stock.getText();
			System.out.println(stocktext);
			if(stocktext.equalsIgnoreCase("RELIANCE"))
			{
				Actions action = new Actions(driver);
				action.moveToElement(stock);
				action.perform();
				
				buystock.click();
			
				
			}
		}
		
	}
	
	
	////li[@class='search-result-item']
}
