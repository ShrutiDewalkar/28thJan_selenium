package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex7_getAllDataInASheet //complete data print//multi-dimensional array logic use
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\Excel data fetching.xlsx");
Sheet sh = WorkbookFactory.create(file).getSheet("sheet5");

int lastRowindex = sh.getLastRowNum();
for(int i=0; i<lastRowindex;i++) //outer for loop=rows
{
	int lastcellindex = sh.getRow(i).getLastCellNum()-1;
	for(int j=0;j<=lastcellindex;j++)
	{
		String value = sh.getRow(i).getCell(j).getStringCellValue();
		System.out.print(value+ " ");
	}
	System.out.println();
	
}


	}

}
