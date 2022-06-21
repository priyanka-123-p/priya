package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterized2 
{
	public static String getdata(int row, int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("E:\\Automation\\newstart2\\Kitezerodha1\\src\\test\\resources\\Credentials.xlsx");
		String value = WorkbookFactory.create(file).getSheet("zerodha").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

}
