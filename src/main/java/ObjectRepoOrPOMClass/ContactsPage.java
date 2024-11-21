package ObjectRepoOrPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']") private WebElement CreateNewContactIcon;
	
   //constructor
	public ContactsPage(WebDriver driver)
    {
	 PageFactory.initElements(driver,this);
	 }
     
	//getters
	public WebElement getCreateNewContactIcon() {
		return CreateNewContactIcon;
	}
	
	/**
	 * business libraries---This method is used to click on create new contact
	 */
	public void clickOnCreateNewContact()
	{
		getCreateNewContactIcon().click();
	}
}


