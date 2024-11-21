package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.SeleniumUtility;

public class Alerthandling {
public static void main(String[]args)
{
	WebDriver driver=new ChromeDriver();
	SeleniumUtility su=new SeleniumUtility();
	su.implicitWait(driver,10);
	
	
}
}

