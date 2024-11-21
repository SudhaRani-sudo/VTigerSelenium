package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractise {

	@Test
	public void strictLevelComparisonHardAssert()
	{
		String expectedvalue="robin";
		String actualvalue="robin";
		Assert.assertEquals(actualvalue, expectedvalue);
		System.out.println("Strict Level Hard Assertion completed");
	}
	
	@Test
	public void containsLevelComparisonHoftAssert()
	{
		String expectedvalue="don";
		String actualvalue="London";
		Assert.assertFalse(actualvalue.contains(expectedvalue));
		System.out.println("Contains Level Hard Assertion completed");
		
		
	}
}
