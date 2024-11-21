package Sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Test annotation can be given at class level also,but not recommended bcoz it will be applicable for user defined methods also
/**
 * @Test is
 */

public class TestNGPractise {

	@Test
	
	public void createUser()
	{
		System.out.println("user created");
	}
	@Test
	public void modifyUser()
	{
		System.out.println("user modified");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("user deleted");
	}
}
