package Sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenfromPropertiesFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("C:\\TestData\\TestData1.properties");
        Properties prop=new Properties();
        prop.load(fis);
        String URL=prop.getProperty("url");
        System.out.println(URL);
        String UN=prop.getProperty("username");
        System.out.println(UN);
        String Pwd=prop.getProperty("password");
        System.out.println(Pwd);

WebDriver driver=new ChromeDriver();
driver.get(URL);
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Pwd);
Thread.sleep(4000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
