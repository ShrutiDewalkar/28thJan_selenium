package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex1_getStringData 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, Exception 
{
	FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\Excel data fetching.xlsx");

	Thread.sleep(3000);
String value = WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(0).getStringCellValue();
System.out.println(value);

//Workbook book = WorkbookFactory.create(file);
//Sheet sh=book.getSheet("sheet 1");
//Row rw =sh.getRow(1);
//Cell cl= rw.getCell(0);
//String value = cl.getStringCellValue();


}
}
