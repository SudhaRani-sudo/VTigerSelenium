package Sample;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import genericUtility.ExcelUtility;


public class DataDrivenfromExcelFile {

	public static void main(String[]args) throws EncryptedDocumentException, IOException 
	{
		//FileInputStream class will read the file byte wise.
		/*FileInputStream fis=new FileInputStream("C:\\TestData\\Smapledata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		//String value =wb.getSheet("one").getRow(1).getCell(0).getStringCellValue();
		
		//to fetch other kind of data than string 
		Cell c=wb.getSheet("one").getRow(1).getCell(0);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(c);
		System.out.println(value);*/
		
		ExcelUtility ex=new ExcelUtility();
		String value1=ex.getDataFromExcel("one",2,2);
		String value2=ex.getDataFromExcel("two",1,1);
		System.out.println(value1);
		System.out.println(value2);
		
	}
}

