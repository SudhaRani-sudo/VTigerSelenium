package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ObjectRepoOrPOMClass.HomePage;
import ObjectRepoOrPOMClass.LoginPage;

public class BaseClass {
	public static WebDriver sDriver; //only for listener
	public WebDriver driver;
	public SeleniumUtility sUtil=new SeleniumUtility();
	public PropertiesUtility pUtil=new PropertiesUtility();
	public ExcelUtility eUtil= new ExcelUtility();
	public javaUtility jutil=new javaUtility();

	@BeforeSuite(alwaysRun=true)
	public void dbConnection() {
		System.out.println("db connected");
	}

	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(@Optional ("chrome") String BROWSER) throws IOException
	{
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else 
		{
			driver=new ChromeDriver();
		}
		sDriver=driver; //this sDriver is initialized and will be used in Listeners
		sUtil.implicitWait(driver,15);
		sUtil.maximizeWindow(driver);
		String URL=pUtil.getDataFromProperties("url");
		sUtil.navigateToUrl(driver,URL);
		System.out.println("browser launched successfully");


	}

	@BeforeMethod
	public void loginOperation() throws Throwable
	{
		String UN=pUtil.getDataFromProperties("username");
		String PWD=pUtil.getDataFromProperties("password");
		LoginPage lp=new LoginPage(driver);
		lp.loginToapplication(UN, PWD);
		System.out.println("login done successfully");

	}
	@AfterMethod
	public void logoutOperation()
	{
		HomePage hp=new HomePage(driver);
		hp.clickonsignout(driver);
		System.out.println("signout done successfully");
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("browser closed successfully");
	}

	@AfterSuite

	public void closeConnection() {
		System.out.println("db connection closed");
	}
}
