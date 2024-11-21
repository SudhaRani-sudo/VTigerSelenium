package ObjectRepoOrPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class LeadsPage {

	@FindBy(xpath="//img[@title='Create Lead...']") private WebElement CreateNewLeadIcon;


     public LeadsPage(WebDriver driver)
     {
	 PageFactory.initElements(driver,this);
	 }


	public WebElement getCreateNewLeadIcon() {
		return CreateNewLeadIcon;
	}
     /**
      * This method is used to click on create new Lead 
      */
	public void clickOnCreateNewLeadIcon()
	{
		getCreateNewLeadIcon().click();
	}
}