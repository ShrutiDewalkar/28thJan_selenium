package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex8_getTypeOfCell //print information typeonly
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\Excel data fetching.xlsx");	
Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");//navigate upto sheet

//excelDT - string,numeric,boolean
CellType cell = sh.getRow(0).getCell(0).getCellType(); //check datatype
System.out.println(cell);


}
}
