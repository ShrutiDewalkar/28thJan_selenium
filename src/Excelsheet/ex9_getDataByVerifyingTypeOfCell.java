package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex9_getDataByVerifyingTypeOfCell //verify data before print
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\Excel data fetching.xlsx");	
Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");

Cell cellinfo = sh.getRow(0).getCell(0); //will get info
CellType s1 = cellinfo.getCellType(); //will get datatype//type wise condition need to give
//add multiple condition
if(s1==CellType.STRING)//== comp 2 side info
{
	String value = cellinfo.getStringCellValue();
	System.out.println(value);
}
else if(s1==CellType.NUMERIC)
{
	double value = cellinfo.getNumericCellValue();
	System.out.println(value);
}
else if(s1==CellType.BOOLEAN)
{
	boolean value = cellinfo.getBooleanCellValue();
	System.out.println(value);
}
}
}
