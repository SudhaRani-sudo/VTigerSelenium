package ObjectRepoOrPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class LoginPage {

    //locate the elements and store 
	@FindBy(xpath="//input[@name='user_name']") private WebElement username;
	@FindBy(xpath="//input[@name='user_password']") private WebElement password;
	@FindBy(xpath="//input[@type='submit']") private WebElement loginsubmit;

	//constructor
     public LoginPage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	
    }

    //getters
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginsubmit() {
		return loginsubmit;
	}
	
    //Business Libraries
	/**
	 * This method is used to perform login operation
	 * @param username
	 * @param password
	 */
	public void loginToapplication(String username,String password)
	{
	getUsername().sendKeys(username);
	getPassword().sendKeys(password);
	getLoginsubmit().click();
}
    }