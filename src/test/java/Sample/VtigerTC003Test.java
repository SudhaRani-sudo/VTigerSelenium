package Sample;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepoOrPOMClass.CreateNewLeadPage;
import ObjectRepoOrPOMClass.HomePage;
import ObjectRepoOrPOMClass.LeadsPage;
import genericUtility.BaseClass;
@Listeners(genericUtility.ListenersImplementation.class)
public class VtigerTC003Test extends BaseClass {

	@Test
	public void LE_03Test() throws Throwable, IOException
	{
     System.out.println("Test Method started");
	HomePage hp=new HomePage(driver);
	hp.clickonLeadMenu();
	LeadsPage leP=new LeadsPage(driver);
	leP.clickOnCreateNewLeadIcon();
	Assert.fail();
	
	String fname=eUtil.getDataFromExcel("Leads",7,1);
	String lname=eUtil.getDataFromExcel("Leads",7,2);
	String company=eUtil.getDataFromExcel("Leads",7,3);
	String title=eUtil.getDataFromExcel("Leads",7,4);
	String phone=eUtil.getDataFromExcel("Leads",7,5);
	String mobile=eUtil.getDataFromExcel("Leads",7,6);
	String email=eUtil.getDataFromExcel("Leads",7,7);
	String noofemployees=eUtil.getDataFromExcel("Leads",7,8);
	
	CreateNewLeadPage cnL=new CreateNewLeadPage(driver);
	cnL.createNewLead(fname,lname,company,title,phone,mobile,email,noofemployees);
	System.out.println("Test Method executed");
}
	@Test
	public void sample()
	{
		System.out.println("Hi");
	}
	
}
