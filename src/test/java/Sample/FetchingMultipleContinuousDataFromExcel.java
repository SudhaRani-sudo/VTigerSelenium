package Sample;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import genericUtility.GetMultipleDataFromExcel;


public class FetchingMultipleContinuousDataFromExcel {

	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		/*FileInputStream fis=new FileInputStream("C:\\TestData\\Smapledata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("three");
		DataFormatter df=new DataFormatter();
		for(int i=0;i<=sh.getLastRowNum();i++)
{
	Row r=sh.getRow(i);
	for(int j=0;j<r.getLastCellNum();j++)
	{
		Cell c=r.getCell(j);
		String value=df.formatCellValue(c);
		System.out.println(value);
	}
}*/
		GetMultipleDataFromExcel gm=new GetMultipleDataFromExcel();
		String result=gm.getMultipleContinuousData("three");
		System.out.println(result);
		
	}
}
