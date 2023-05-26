package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex11_getAllDataInACol1
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\Excel data fetching.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet5");
	
	int lastrowindex = sh.getLastRowNum();
	for(int i=0;i<=lastrowindex;i++)
	{
		Cell cellinfo = sh.getRow(i).getCell(0);
		CellType s1 = cellinfo.getCellType();
		
		if(s1==CellType.STRING)
		{
			String value = cellinfo.getStringCellValue();
			System.out.println(value+"");
		}
		else if(s1==CellType.NUMERIC)
		{
			double value = cellinfo.getNumericCellValue();
			System.out.println(value+" ");
		}
		else if (s1==CellType.BOOLEAN)
		{
			boolean value = cellinfo.getBooleanCellValue();
			System.out.println(value+" ");
			
		}
	}
	
	
	
	
}
}
