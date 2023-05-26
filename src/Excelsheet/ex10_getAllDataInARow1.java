package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex10_getAllDataInARow1 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\Excel data fetching.xlsx");
Sheet sh = WorkbookFactory.create(file).getSheet("sheet5");
int lastcellIndex = sh.getRow(0).getLastCellNum()-1;

for(int i=0;i<=lastcellIndex;i++)
{
	Cell cellinfo = sh.getRow(0).getCell(i);
			CellType s1 = cellinfo.getCellType();
			
			if(s1==CellType.STRING)
			{
               String value = cellinfo.getStringCellValue();
               System.out.print(value+" ");
			}
			else if(s1==CellType.NUMERIC)
			{
				double value = cellinfo.getNumericCellValue();
				System.out.print(value+" ");
			}
			else if(s1==CellType.BOOLEAN)
			{
				boolean value = cellinfo.getBooleanCellValue();
				System.out.print(value+" ");
			}




}
}
}

