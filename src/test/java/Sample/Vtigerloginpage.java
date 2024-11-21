package Sample;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;


public class Vtigerloginpage {
	public static void main(String[]args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		PropertiesUtility p =new PropertiesUtility();
		String URL=p.getDataFromProperties("url");
		String UN=p.getDataFromProperties("username");
	System.out.println(URL);
	System.out.println(UN);
		driver.get(URL);

	}
}
