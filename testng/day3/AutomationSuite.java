package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class AutomationSuite {
	
	@Test(groups= {"smoke","regression"})
	public void createLead() {
		System.out.println("Create Lead");
		throw new NoSuchElementException();

	}
	
	@Test(groups= {"functional"})
	public void editLead() {
		System.out.println("editLead");
		throw new NoSuchElementException();
	}
	
	@Test(groups= {"functional"})
	public void mergeLead() {
		System.out.println("mergeLead");

	}
	
	@Test(groups= {"functional"})
	public void duplicateLead() {
		System.out.println("duplicateLead");

	}
	@Test(groups= {"functional","regression"})
	public void deleteLead() {
		System.out.println("deleteLead");

	}

}
