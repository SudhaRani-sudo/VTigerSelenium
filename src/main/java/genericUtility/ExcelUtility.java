package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * 
	 * Authorname SudhaRani
	 * version 18.10.24
	 */
	public String getDataFromExcel(String SheetName,int rownum, int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IPathConstant.excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Cell c=wb.getSheet(SheetName).getRow(rownum).getCell(cellnum);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(c);
		//System.out.println(value);
		return value;
	}

}


