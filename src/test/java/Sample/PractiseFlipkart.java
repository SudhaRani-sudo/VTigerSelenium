package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseFlipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		WebElement element=driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
		element.sendKeys("iphone");
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		element.sendKeys("iphone");
		
		
		
		

	}

}
