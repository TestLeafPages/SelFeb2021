package testng.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnDependency {
	
	@Test
	public void createLead() {
		System.out.println("CreateLead");
		throw new NoSuchElementException();
	}
	
	@Test
	public void editLead() {
		System.out.println("EditLead");

	}
	
	@Test//(dependsOnMethods = {"createLead","editLead"} )
	public void deleteLead() {
		System.out.println("DeleteLead");

	}

}
