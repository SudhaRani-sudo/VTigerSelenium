package ObjectRepoOrPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage {

	@FindBy(xpath="//input[@name='firstname']") private WebElement FirstName;
	@FindBy(xpath="//input[@name='lastname']") private WebElement LastName;
	@FindBy(xpath="//input[@name='title']") private WebElement Title;
	@FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement SaveButton;


   //constructor
   public CreateNewContactPage(WebDriver driver)
   {
    PageFactory.initElements(driver,this);
 
   }

   //getters
    public WebElement getFirstName() {
	return FirstName;
    }


     public WebElement getLastName() {
	return LastName;
     }


    public WebElement getTitle() {
	return Title;
   }


    public WebElement getSaveButton() {
	return SaveButton;
     }
    /**
     * This method is used to create a contact
     * @param Firstname
     * @param Lastname
     * @param Title
     */
public void createNewContact(String Firstname, String Lastname,String Title)
{
	getFirstName().sendKeys(Firstname); 
	getLastName().sendKeys(Lastname);
	getTitle().sendKeys(Title);
	getSaveButton().click();
}
   

   }