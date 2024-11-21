package Sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractise {

	@Test
	public void strictLevelComparisionSoftAssertion()
	{
		String expectedvalue="raja";
		String actualvalue="Raja";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualvalue, expectedvalue);
		System.out.println("Strict Level Soft Assertion is completed");
		s.assertAll();
	}
	@Test
	public void containsLevelComparisionSoftAssertion()
	{
		String expectedvalue="corn";
		String actualvalue="Popcorn";
		SoftAssert s=new SoftAssert();
		s.assertFalse(actualvalue.contains(expectedvalue));
		System.out.println("Contains Level Soft Assertion is completed");
		s.assertAll();
		
	}
}
