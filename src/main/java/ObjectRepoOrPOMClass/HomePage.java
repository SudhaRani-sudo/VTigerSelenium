package ObjectRepoOrPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	 //locate the elements and store 
		@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']") private WebElement leads;
		@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']") private WebElement organisations;
		@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']") private WebElement contacts;
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']") private WebElement AdministratorIcon;
		@FindBy(xpath="//a[text()='Sign Out']") private WebElement signoutoption;
		
		//constructor
		public HomePage(WebDriver driver) {
			 PageFactory.initElements(driver,this);
			
		    }
        //getters
		public WebElement getLeads() {
			return leads;
		}

		public WebElement getOrganisations() {
			return organisations;
		}

		public WebElement getContacts() {
			return contacts;
		}

		public WebElement getAdministratorIcon() {
			return AdministratorIcon;
		}

		public WebElement getSignoutoption() {
			return signoutoption;
		}
		
		//business libraries
        /**
        * method to click on lead menu
        */
		public void clickonLeadMenu()
		{
		getLeads().click();
		}
		/**
		 * method to click on organisation menu
		 */
		public void clickonOrganisation()
		{
		getOrganisations().click();
		}
        /**
        * method to click on contacts menu
        */
		public void clickonContacts()
        {
	    getContacts().click();
        }
       /**
        * method to click on adminIcon
        */
       public void clickonAdministratoricon()
          {
	   getAdministratorIcon().click();
       }
       /**
        * method to click on sign-out option
        */
       public void clickonsignout(WebDriver driver)
       {
    	   Actions act=new Actions(driver);
	 act.moveToElement(getAdministratorIcon()).perform();
	 getSignoutoption().click();
       }
}
