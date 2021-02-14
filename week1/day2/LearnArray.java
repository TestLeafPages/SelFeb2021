package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		// int input = 3;

		// declare array using new keyword
		//int[] num = new int[3];

		/*
		 * num[0] = 10; // array index starts with 0 num[1] = 20; num[2] = 30; // length
		 * -1 // num[3] = 40;
		 */		
		
		//int[] num = new int[3];
		
		int[] num = {45,95,55};  // 45,55,95
		
		//to sort the values in ascending order
		Arrays.sort(num);
		
		for (int i =num.length-1 ; i >= 0; i--) {
			System.out.println(num[i]);
			
		}

		// length to get the limit of the array
		//System.out.println(num.length);

		// to get the first data - index as 0 
		//System.out.println(num[0]);

		// to last data from the array 
		//System.out.println(num[num.length-1]);

	}

}
