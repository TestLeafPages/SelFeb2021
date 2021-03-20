package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testng.day3.RetryFailedTestcases;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setFileName() {
		excelFileName = "CreateLead";

	}
	
	@Test(dataProvider = "fetchData", retryAnalyzer = RetryFailedTestcases.class)
	public void runCreateLead(String company, String firstName,String lastName) {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
		driver.findElementByName("submitButton").click();
		
		boolean fName = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		softAssert.assertTrue(fName);
		softAssert.assertAll();
	}
	
	
	
}
