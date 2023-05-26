package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//row data chnge
//1 col cha multiple row cha data fetch
public class ex6_getAllDataInACol 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\Excel data fetching.xlsx");

Sheet sh = WorkbookFactory.create(file).getSheet("sheet5");
int lastrowIndex = sh.getLastRowNum();

for(int i=0; i<=lastrowIndex;i++)
{
	String value = sh.getRow(i).getCell(0).getStringCellValue();
	System.out.println(value);
}






}
}
