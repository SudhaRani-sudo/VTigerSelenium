package Sample;



import java.io.IOException;

import genericUtility.PropertiesUtility;

public class LoginToVtigerApp {

	public static void main(String[] args) throws IOException  {
		PropertiesUtility pu=new PropertiesUtility();
		String UN=pu.getDataFromProperties("username");
		String PW=pu.getDataFromProperties("password");
		
		

	}

}
