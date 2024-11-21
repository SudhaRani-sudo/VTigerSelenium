package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class SeleniumUtility 
{
public void implicitWait(WebDriver driver, int maxTime)
{

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));

}
public void maximizeWindow(WebDriver driver)
{
	driver.manage().window().maximize();
}

public void navigateToUrl(WebDriver driver,String URL)
{
	driver.navigate().to(URL);
}

public String captureScreenshot(WebDriver driver,String screenshotName) throws IOException
{
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(".\\screenshot\\"+screenshotName+".png");
	Files.copy(src,dest);
	return dest.getAbsolutePath();
	
}

/*public void alertAccept()
{
	driver.switchTo().alert().accept();
}
public void alertCancel()
{
	driver.switchTo().alert().dismiss();
}
public void alertMessage()
{
	driver.switchTo().alert().getText();
}*/
}
