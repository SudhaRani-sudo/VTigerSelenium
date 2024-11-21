package Sample;





import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepoOrPOMClass.CreateNewLeadPage;
import ObjectRepoOrPOMClass.HomePage;
import ObjectRepoOrPOMClass.LeadsPage;
import genericUtility.BaseClass;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;


public class VTigerLogin001Test extends BaseClass {
	SeleniumUtility sUtil=new SeleniumUtility();
	PropertiesUtility p=new PropertiesUtility();
	@Test
	public void LE_01() throws EncryptedDocumentException, IOException 
	{
		System.out.println("test method started");
		HomePage hp=new HomePage(driver);
		hp.clickonLeadMenu();
		LeadsPage leP=new LeadsPage(driver);
		leP.clickOnCreateNewLeadIcon();
		String fname=eUtil.getDataFromExcel("Leads",1,1);
		String lname=eUtil.getDataFromExcel("Leads",1,2);
		String company=eUtil.getDataFromExcel("Leads",1,3);
		CreateNewLeadPage cnL=new CreateNewLeadPage(driver);
		cnL.createNewLead(fname,lname,company);
		System.out.println("Test Method executed");
		
		
		
	}

}


