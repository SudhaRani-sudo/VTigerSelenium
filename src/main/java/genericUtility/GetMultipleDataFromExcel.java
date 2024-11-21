package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetMultipleDataFromExcel {

	public String getMultipleContinuousData(String SheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IPathConstant.multipledataexcel);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("SheetName");
		DataFormatter df=new DataFormatter();
		String value="null";
		for(int i=0;i<=sh.getLastRowNum();i++)
{
	Row r=sh.getRow(i);
	for(int j=0;j<r.getLastCellNum();j++)
	{
		Cell c=r.getCell(j);
		  value=df.formatCellValue(c);
		//System.out.println(value);
		
	}
}
		return value;
	
		
	
}
}