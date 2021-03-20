package week6.day1;

public class Employees {
	int empId;
	String empName;
	static String compName;
	/*
	 * boolean isActive; double empSalary;
	 */

	
	  Employees() { 
		  this(100,"Hari","TestLeaf");
		  System.out.println("default Constructor"); 
	  }
	 
	
	Employees(int empId, String empName, String company) {
		System.out.println("parameterized Constructor");
		this.empId = empId;
		this.empName = empName;
		compName = company;
		
	}
	
	
	public static void staticMethod() {
		System.out.println("static method");
	}
	
	public void printDetails() {
		System.out.println(empId+" "+empName+" "+compName);
		

	}

	public static void main(String[] args) {
		
		//staticMethod();
		
		
		  Employees emp1 = new Employees(); 
	//	  Employees emp2 = new  Employees(200,"Prasad","TestLeaf Software Solutions");
		  
		  emp1.printDetails(); 
		  //emp2.printDetails();
		 
		
		
		
		/*
		 * System.out.println(emp1.isActive); System.out.println(emp1.empSalary);
		 */

	}

}
