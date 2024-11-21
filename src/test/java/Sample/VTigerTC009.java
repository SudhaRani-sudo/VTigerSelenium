package Sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import ObjectRepoOrPOMClass.ContactsPage;
import ObjectRepoOrPOMClass.CreateNewContactPage;

import ObjectRepoOrPOMClass.HomePage;

import genericUtility.BaseClass;

public class VTigerTC009 extends BaseClass{

	
	public void CON_09test() throws EncryptedDocumentException, IOException
	{
 

	System.out.println("Test method started");	
	HomePage hp=new HomePage(driver);
	hp.clickonContacts();
	ContactsPage leP=new ContactsPage(driver);
	leP.clickOnCreateNewContact();
	String fname=eUtil.getDataFromExcel("Contacts",1,1);
	String lname=eUtil.getDataFromExcel("Contacts",1,2);
	String title=eUtil.getDataFromExcel("Contacts",1,3);
	

	CreateNewContactPage cnL=new CreateNewContactPage(driver);
	cnL.createNewContact(fname,lname,title);
	System.out.println("Test Method executed");
	}
}
