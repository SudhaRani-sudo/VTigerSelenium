package Sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepoOrPOMClass.CreateNewOrganisationPage;
import ObjectRepoOrPOMClass.HomePage;
import ObjectRepoOrPOMClass.OrganisationPage;
import genericUtility.BaseClass;

public class VTigerTC007 extends BaseClass {
@Test
	public void OR_07test() throws EncryptedDocumentException, IOException
	{
 

	System.out.println("Test method started");	
	HomePage hp=new HomePage(driver);
	hp.clickonOrganisation();
	OrganisationPage leP=new OrganisationPage(driver);
	leP.clickOnCreateNewOrganisation();
	String name=eUtil.getDataFromExcel("Organisation",7,1);
	String website=eUtil.getDataFromExcel("Organisation",7,2);
	String billingAddress=eUtil.getDataFromExcel("Organisation",7,3);
	String billingCity=eUtil.getDataFromExcel("Organisation",7,4);
	String billingState=eUtil.getDataFromExcel("Organisation",7,5);

	CreateNewOrganisationPage cnL=new CreateNewOrganisationPage(driver);
	cnL.createNewOrganisation(name,website,billingAddress,billingCity,billingState);
	System.out.println("Test Method executed");
	}
}
