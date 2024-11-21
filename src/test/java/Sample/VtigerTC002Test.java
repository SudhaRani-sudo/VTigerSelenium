package Sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepoOrPOMClass.CreateNewLeadPage;
import ObjectRepoOrPOMClass.HomePage;
import ObjectRepoOrPOMClass.LeadsPage;
import genericUtility.BaseClass;
@Listeners(genericUtility.ListenersImplementation.class)
public class VtigerTC002Test  extends BaseClass{
	@Test
	public void LE_02test() throws EncryptedDocumentException, IOException
	{
 

	System.out.println("Test method started");	
	HomePage hp=new HomePage(driver);
	hp.clickonLeadMenu();
	LeadsPage leP=new LeadsPage(driver);
	leP.clickOnCreateNewLeadIcon();
	//Assert.fail();
	String fname=eUtil.getDataFromExcel("Leads",4,1);
	String lname=eUtil.getDataFromExcel("Leads",4,2);
	String company=eUtil.getDataFromExcel("Leads",4,3);
	String title=eUtil.getDataFromExcel("Leads",4,4);
	String phone=eUtil.getDataFromExcel("Leads",4,5);
	String mobile=eUtil.getDataFromExcel("Leads",4,6);
	String email=eUtil.getDataFromExcel("Leads",4,7);
	String noofemployees=eUtil.getDataFromExcel("Leads",4,8);
	String street=eUtil.getDataFromExcel("Leads",4,9);
	String pobox=eUtil.getDataFromExcel("Leads",4,10);
	String postalcode=eUtil.getDataFromExcel("Leads",4,11);
	String city=eUtil.getDataFromExcel("Leads",4,12);
	String country=eUtil.getDataFromExcel("Leads",4,13);
	String state=eUtil.getDataFromExcel("Leads",4,14);

	CreateNewLeadPage cnL=new CreateNewLeadPage(driver);
	cnL.createNewLead(fname,lname,company,title,phone,mobile,email,noofemployees,street,pobox,postalcode,city,country,state);
	System.out.println("Test Method executed");
	}
}
