package week1.day2;

import java.util.Scanner;

public class GetDataFromUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String str = scan.nextLine();
		
		System.out.println(str);
		
		/*
		 * System.out.println("Enter the first number"); int x = scan.nextInt();
		 * System.out.println("Enter the second number"); int y = scan.nextInt();
		 * 
		 * System.out.println(x+y);
		 */
	}

}
