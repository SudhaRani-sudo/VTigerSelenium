package ObjectRepoOrPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {

	@FindBy(xpath="//img[@title='Create Organization...']") private WebElement CreateNewOrganisationIcon;
	
	//constructor
	public OrganisationPage(WebDriver driver)
    {
	 PageFactory.initElements(driver,this);
	 }

	//getters
	public WebElement getCreateNewOrganisationIcon() {
		return CreateNewOrganisationIcon;
	}
	/**
	 * This method is used to click on Create new organization
	 */
	public void clickOnCreateNewOrganisation()
	{
		getCreateNewOrganisationIcon().click();
	}
}
