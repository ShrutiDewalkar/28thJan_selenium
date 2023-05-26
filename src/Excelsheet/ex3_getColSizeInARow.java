package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3_getColSizeInARow //1 row mdhe kiti coln
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\Excel data fetching.xlsx");	

short colsize = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getLastCellNum();
System.out.println(colsize);
//short-num non decimal value store
}
}
//