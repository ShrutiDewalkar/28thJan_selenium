package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex4_getNumericDataAsAString 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\Excel data fetching.xlsx");

String value =WorkbookFactory.create(file).getSheet("sheet2").getRow(0).getCell(0).getStringCellValue();

System.out.println(value);

//convert numeric to string '101

}
}
