package ObjectRepoOrPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganisationPage {

	@FindBy(xpath="//input[@name='accountname']") private WebElement OrganizationName;
	@FindBy(xpath="//input[@name='website']") private WebElement Website;
    @FindBy(xpath="//input[@name='employees']") private WebElement Employees;
    @FindBy(xpath="//input[@name='phone']") private WebElement Phone;
    @FindBy(xpath="//input[@name='otherphone']") private WebElement OtherPhone;
    @FindBy(xpath="//input[@name='email1']") private WebElement Email;
    @FindBy(xpath="//textarea[@name='bill_street']") private WebElement BillingAddress;
    @FindBy(xpath="//input[@name='bill_city']") private WebElement BillingCity;
    @FindBy(xpath="//input[@name='bill_state']") private WebElement Billingstate;
    @FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement SaveButton;

    //constructor
    public CreateNewOrganisationPage(WebDriver driver)
    {
	 PageFactory.initElements(driver,this);
	 }
   //getters
	public WebElement getOrganizationName() {
		return OrganizationName;
	}

	public WebElement getWebsite() {
		return Website;
	}

	public WebElement getEmployees() {
		return Employees;
	}

	public WebElement getPhone() {
		return Phone;
	}

	public WebElement getOtherPhone() {
		return OtherPhone;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getBillingCity() {
		return BillingCity;
	}

	public WebElement getBillingstate() {
		return Billingstate;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
    
    /**
     * This method is used to create organization
     * @param OrgName
     * @param Website
     * @param employees
     */
    public void createNewOrganisation(String OrgName,String Website,String employees)
    {
    	getOrganizationName().sendKeys(OrgName);
    	getWebsite().sendKeys(Website);
    	getEmployees().sendKeys(employees);
    	getSaveButton().click();
    }
    /**
     * 
     * @param OrgName
     * @param Website
     * @param employees
     * @param phone
     * @param otherPhone
     * @param Email
     */
   public void createNewOrganisation(String OrgName,String Website,String employees,String phone, String otherPhone,String Email)
    {
    	getOrganizationName().sendKeys(OrgName);
    	getWebsite().sendKeys(Website);
    	getEmployees().sendKeys(employees);
    	getPhone().sendKeys(phone);
    	getOtherPhone().sendKeys(otherPhone);
    	getEmail().sendKeys(Email);
    	getSaveButton().click();
    }
   /**
    * 
    * @param OrgName
    * @param Website
    * @param BillingAddress
    * @param BillingCity
    * @param BillingState
    */
   public void createNewOrganisation(String OrgName,String Website,String BillingAddress,String BillingCity,String BillingState)
   {
    getOrganizationName().sendKeys(OrgName);
   	getWebsite().sendKeys(Website);
   	getBillingAddress().sendKeys(BillingAddress);
   	getBillingCity().sendKeys(BillingCity);
   	getBillingstate().sendKeys(BillingState);
   	getSaveButton().click();
   }
   /**
    * 
    * @param OrgName
    * @param Website
    * @param employees
    * @param phone
    * @param otherPhone
    * @param Email
    * @param BillingAddress
    * @param BillingCity
    * @param BillingState
    */
   public void createNewOrganisation(String OrgName,String Website,String employees,String phone, String otherPhone,String Email,String BillingAddress,String BillingCity,String BillingState)
   {
   	getOrganizationName().sendKeys(OrgName);
   	getWebsite().sendKeys(Website);
   	getEmployees().sendKeys(employees);
   	getPhone().sendKeys(phone);
   	getOtherPhone().sendKeys(otherPhone);
   	getEmail().sendKeys(Email);
   	getBillingAddress().sendKeys(BillingAddress);
   	getBillingCity().sendKeys(BillingCity);
   	getBillingstate().sendKeys(BillingState);
   	getSaveButton().click();
   }
}

