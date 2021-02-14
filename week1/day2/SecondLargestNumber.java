package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		
		//sort the given array
		Arrays.sort(data); //2,3,4,6,7,11
		
		//finding index for the second largest
		int len = data.length -2;
		
		System.out.println(data[len]);
		
		
	}

}
