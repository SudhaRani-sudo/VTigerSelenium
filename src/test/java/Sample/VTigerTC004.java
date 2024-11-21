package Sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepoOrPOMClass.CreateNewLeadPage;
import ObjectRepoOrPOMClass.HomePage;
import ObjectRepoOrPOMClass.LeadsPage;
import genericUtility.BaseClass;

public class VTigerTC004 extends BaseClass {

	@Test
	public void LE_04test() throws EncryptedDocumentException, IOException
	{
 

	System.out.println("Test method started");	
	HomePage hp=new HomePage(driver);
	hp.clickonLeadMenu();
	LeadsPage leP=new LeadsPage(driver);
	leP.clickOnCreateNewLeadIcon();
	String fname=eUtil.getDataFromExcel("Leads",4,1);
	String lname=eUtil.getDataFromExcel("Leads",4,2);
	String company=eUtil.getDataFromExcel("Leads",4,3);
	
	String street=eUtil.getDataFromExcel("Leads",4,9);
	String pobox=eUtil.getDataFromExcel("Leads",4,10);
	String postalcode=eUtil.getDataFromExcel("Leads",4,11);
	String city=eUtil.getDataFromExcel("Leads",4,12);
	String country=eUtil.getDataFromExcel("Leads",4,13);
	String state=eUtil.getDataFromExcel("Leads",4,14);

	CreateNewLeadPage cnL=new CreateNewLeadPage(driver);
	cnL.createNewLead(fname,lname,company,street,pobox,postalcode,city,country,state);
	System.out.println("Test Method executed");
	}
}
