package testng.day1;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test(priority = -1, invocationCount = 0)
	public void createLead() {
		System.out.println("CreateLead");

	}

	@Test(priority = 3, enabled = false)
	public void editLead() {
		System.out.println("EditLead");

	}
	
	@Test
	public void deleteLead() {
		System.out.println("DeleteLead");

	}
}
