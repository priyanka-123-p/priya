package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser;

public class screenshot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = Browser.openbrowser("https://www.facebook.com/");
		
		File source =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("F:\\software testing\\aditi.jpeg");
		FileHandler.copy(source, destination);
		
	}

}
