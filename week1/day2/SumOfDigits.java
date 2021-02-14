package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int input = 123;
		
		int orgNum = input;
		
		int sum = 0;
		
		while(input != 0) {
			
			int rem = input % 10;
			sum = sum + (rem * rem * rem);
			
			input = input / 10; //12
			
		}
		
		if(sum == orgNum) {
			System.out.println(orgNum+" -"+" is an armstrong number");
		}
		else {
			System.out.println(orgNum+" -"+" is not an armstrong number");
		}
		
		

	}

}
