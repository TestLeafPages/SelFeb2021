package testng.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertion {

	@Test
	public void leafTapsLogin() {
		
		String expTitle = "TestLeaf Automation Platform";

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		boolean linkPresent = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		String actTitle = driver.getTitle();
		
		
		
		//soft assert
		SoftAssert softAssert = new SoftAssert();
		
		//first Assertion
		//softAssert.assertTrue(linkPresent);  //pass
		softAssert.assertFalse(linkPresent); //failure
		
		//second Assertion
		softAssert.assertEquals(actTitle, expTitle); // failure
		
		
		
		//Hard Assert	
		//Assert.assertEquals(actTitle, expTitle);
		
		//there is no exception
		driver.close();
		System.out.println("Execution completed");
		
		//step to consolidate the result
		softAssert.assertAll(); // mandatory
		
		
		
		/*
		 * if(expTitle.equals(actTitle)) { System.out.println("Test Pass"); } else {
		 * System.out.println("Test Fail"); }
		 */
		

	}

}
