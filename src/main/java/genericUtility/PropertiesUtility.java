package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	public String getDataFromProperties(String key) throws IOException
	{
	FileInputStream fis=new FileInputStream(IPathConstant.propertiespath);
    Properties prop=new Properties();
    prop.load(fis);
    String value=prop.getProperty(key);
    System.out.println(value);
    return value;
}
}
