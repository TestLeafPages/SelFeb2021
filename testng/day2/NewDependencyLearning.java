package testng.day2;

import org.testng.annotations.Test;

public class NewDependencyLearning {
	//packageName.ClassName.methodName
	@Test(dependsOnMethods="testng.day2.LearnDependency.createLead")
	public void duplicateLead() {
		System.out.println("DuplicateLead");

	}

}
