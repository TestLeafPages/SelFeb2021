package testng.day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTestCases extends BaseClass {
	@Test
	public void test3() {

		System.out.println("test3");

	}

	@BeforeMethod
	public void preCondition() {
		System.out.println("beforemethod - TestNGTestCase");

	}
}
