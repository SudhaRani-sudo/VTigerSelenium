package Sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepoOrPOMClass.CreateNewOrganisationPage;
import ObjectRepoOrPOMClass.HomePage;
import ObjectRepoOrPOMClass.OrganisationPage;
import genericUtility.BaseClass;

public class VTigerTC006 extends BaseClass{
@Test
	public void OR_06test() throws EncryptedDocumentException, IOException
	{
 

	System.out.println("Test method started");	
	HomePage hp=new HomePage(driver);
	hp.clickonOrganisation();
	OrganisationPage leP=new OrganisationPage(driver);
	leP.clickOnCreateNewOrganisation();
	String name=eUtil.getDataFromExcel("Organisation",4,1);
	String website=eUtil.getDataFromExcel("Organisation",4,2);
	String employees=eUtil.getDataFromExcel("Organisation",4,3);
	String phone=eUtil.getDataFromExcel("Organisation",4,4);
	String email=eUtil.getDataFromExcel("Organisation",4,5);

	CreateNewOrganisationPage cnL=new CreateNewOrganisationPage(driver);
	cnL.createNewOrganisation(name,website,employees,phone,email);
	System.out.println("Test Method executed");
	}
}


