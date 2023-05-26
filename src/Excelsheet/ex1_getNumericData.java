package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex1_getNumericData 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\Excel data fetching.xlsx");

Double value =WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(1).getNumericCellValue();
System.out.println(value);
}
}
