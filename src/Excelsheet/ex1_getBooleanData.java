package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex1_getBooleanData 
{
	
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\Excel data fetching.xlsx");
//excel open
	boolean value =WorkbookFactory.create(file).getSheet("sheet3").getRow(0).getCell(2).getBooleanCellValue();

	System.out.println(value);
}
}
//workbook- class=excel open
//file - workbook cha object
//getsheet=partiular sheet navigate krel
//last index + 1= row cha size milel
//last row index return krel=size la janya sathi +1 krnar
//size ahe to last index la jaich asel tr -1
//col index ahe to size kde jaila +1