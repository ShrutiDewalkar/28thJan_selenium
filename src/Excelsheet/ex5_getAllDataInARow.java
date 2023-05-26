package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//multiple data print karaicha asel=> go to loop//row index fix//1 row cha mul coln data print
public class ex5_getAllDataInARow //data from row only//string5
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file = new FileInputStream("E:\\SOFTWARE TESTING\\28thJan_Selenium_Software\\Excel data fetching.xlsx");
//first navigate to sheet and then store in one object
Sheet sh = WorkbookFactory.create(file).getSheet("sheet4");
int lastcellindex = sh.getRow(0).getLastCellNum() -1;
          //2<=3
for(int i =0; i<=lastcellindex;i++)//0to 3//for loop varaible - i
{//1
	String value = sh.getRow(0).getCell(i).getStringCellValue();
	System.out.print(value+ " ");
}
System.out.println("");
}
}
//1 row cha multiple coln cha data print 