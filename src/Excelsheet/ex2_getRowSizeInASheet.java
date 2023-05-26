package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex2_getRowSizeInASheet 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\Excel data fetching.xlsx");
	
	int rowsize= WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum()+ 1;
	System.out.println(rowsize);
	
}
}
