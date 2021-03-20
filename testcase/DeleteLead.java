package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends BaseClass{

	@Test
	public  void runDelete() throws InterruptedException {
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String text = driver.findElementByClassName("x-paging-info").getText();
		
		softAssert.assertEquals(text, "No records to display");
		
		softAssert.assertAll();
}
}






