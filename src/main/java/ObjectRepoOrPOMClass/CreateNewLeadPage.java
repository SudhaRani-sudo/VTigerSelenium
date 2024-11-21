package ObjectRepoOrPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {

	
	@FindBy(xpath="//input[@name='firstname']") private WebElement FirstName;
	@FindBy(xpath="//input[@name='lastname']") private WebElement LastName;
	@FindBy(xpath="//input[@name='company']") private WebElement Company;
	@FindBy(xpath="//input[@name='designation']") private WebElement Title;
	@FindBy(xpath="//input[@id='phone']") private WebElement Phone;
	@FindBy(xpath="//input[@id='mobile']") private WebElement Mobile;
	@FindBy(xpath="//input[@id='email']") private WebElement Email;
	@FindBy(xpath="//input[@id='noofemployees']") private WebElement NoOfEmployees;
	@FindBy(xpath="//textarea[@name='lane']") private WebElement Street;
	@FindBy(xpath="//input[@id='pobox']") private WebElement POBox;
	@FindBy(xpath="//input[@id='code']") private WebElement PostalCode;
	@FindBy(xpath="//input[@id='city']") private WebElement City;
	@FindBy(xpath="//input[@id='country']") private WebElement Country;
	@FindBy(xpath="//input[@id='state']") private WebElement State;
	@FindBy(xpath="//input[@class='crmbutton small save']") private WebElement SaveButton;
	
	//constructors--initialize all the elements 
	public CreateNewLeadPage(WebDriver driver)
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

	public WebElement getCompany() {
		return Company;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getPhone() {
		return Phone;
	}

	public WebElement getMobile() {
		return Mobile;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getNoOfEmployees() {
		return NoOfEmployees;
	}

	public WebElement getStreet() {
		return Street;
	}

	public WebElement getPOBox() {
		return POBox;
	}

	public WebElement getPostalCode() {
		return PostalCode;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getState() {
		return State;
	}
	public WebElement getsave() {
		return SaveButton;
	}
	
// business libraries
	/**
	 * 
	 * @param FName
	 * @param LName
	 * @param Company
	 */
	public void createNewLead(String FName, String LName, String Company)
	{
		getFirstName().sendKeys(FName);
		getLastName().sendKeys(LName);
		getCompany().sendKeys(Company);
		getsave() .click();
	}
	/**
	 * This is a business library to create a new lead
	 * @param FName
	 * @param LName
	 * @param Company
	 * @param title
	 * @param Mobile
	 * @param Phone
	 * @param Email
	 * @param NoOfEmployess
	 * @param Street
	 * @param POBox
	 * @param PostalCode
	 * @param City
	 * @param Country
	 * @param State
	 */
	public void createNewLead(String FName, String LName, String Company,String title,String Mobile,String Phone,String Email,String NoOfEmployess,String Street,String POBox,String PostalCode,String City, String Country, String State )
	{
		getFirstName().sendKeys(FName);
		getLastName().sendKeys(LName);
		getCompany().sendKeys(Company);
		getTitle().sendKeys(title);
		getPhone().sendKeys(Phone);
		getMobile().sendKeys(Mobile);
		getEmail().sendKeys(Email);
		getNoOfEmployees().sendKeys(NoOfEmployess);
		getStreet().sendKeys(Street);
		getPOBox().sendKeys(POBox);
		getPostalCode().sendKeys(PostalCode);
		getCity().sendKeys(City);
		getCountry().sendKeys(Country);
		getState().sendKeys(State);
		getsave() .click();
	}
	
	/**
	 * 
	 * @param FName
	 * @param LName
	 * @param Company
	 * @param title
	 * @param Mobile
	 * @param Phone
	 * @param Email
	 * @param NoOfEmployess
	 */
	public void createNewLead(String FName, String LName, String Company,String title,String Mobile,String Phone,String Email,String NoOfEmployess)
	{
		getFirstName().sendKeys(FName);
		getLastName().sendKeys(LName);
		getCompany().sendKeys(Company);
		getTitle().sendKeys(title);
		getPhone().sendKeys(Phone);
		getMobile().sendKeys(Mobile);
		getEmail().sendKeys(Email);
		getNoOfEmployees().sendKeys(NoOfEmployess);
		getsave().click();
	}
	/**
	 * 
	 * @param FName
	 * @param LName
	 * @param Company
	 * @param Street
	 * @param POBox
	 * @param PostalCode
	 * @param City
	 * @param Country
	 * @param State
	 */
	
	public void createNewLead(String FName, String LName, String Company,String Street,String POBox,String PostalCode,String City, String Country, String State )
	{
		getFirstName().sendKeys(FName);
		getLastName().sendKeys(LName);
		getCompany().sendKeys(Company);
		getStreet().sendKeys(Street);
		getPOBox().sendKeys(POBox);
		getPostalCode().sendKeys(PostalCode);
		getCity().sendKeys(City);
		getCountry().sendKeys(Country);
		getsave() .click();
	}

}
