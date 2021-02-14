package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		//declare using String literal
		//0,1,2,3,4,5,6
		String str1 = "Welcome to java session"; // each character in the string saved with index; index starts 0
		
		String[] words = str1.split("e");
		
		System.out.println(words[2]);
		
		
		
		//System.out.println(str1.substring(2,6));
		
	//	System.out.println(str1.replaceAll("[a-zA-Z]", ""));
		
		/*
		 * int orgLen = str1.length();
		 * 
		 * String stringWithoutE = str1.replace("e", "");
		 * 
		 * int lenAfterRemovingE = stringWithoutE.length();
		 * 
		 * System.out.println(orgLen - lenAfterRemovingE);
		 * 
		 * // System.out.println(str1.replace("e", ""));
		 */		
		
		/*
		 * char[] charArray = str1.toCharArray(); for (int i = charArray.length-1; i >=
		 * 0; i--) {
		 * 
		 * System.out.print(charArray[i]);
		 * 
		 * }
		 */
		
		/*
		 * for (int i = str1.length()-1; i >= 0; i--) {
		 * System.out.print(str1.charAt(i));
		 * 
		 * }
		 */
		
		//length()-1 to get the index of last character
		/*
		 * System.out.println(str1.length()-1);
		 * 
		 * System.out.println(str1.charAt(3));
		 * 
		 * System.out.println(str1.charAt(str1.length()-1));
		 */
		
		
		
		
		
		//String str2 = "come";
		
		//System.out.println(str1.contains(str2));
		
		
		/*
		 * String str2 = "COME123";
		 * 
		 * int num =123;
		 * 
		 * //to compare System.out.println(str1.equals(str2));
		 * System.out.println(str1.equalsIgnoreCase(str2));
		 * 
		 * //to concatenate System.out.println(str1+str2);
		 * System.out.println(str1.concat(str2));
		 * 
		 * System.out.println(str1.contains(str2));
		 */
		
		
		/*
		 * //declare using new keyword String str3 = new String("Welcome");
		 * 
		 * System.out.println(str1 == str2); //this will compare the memory address of
		 * variable
		 * 
		 * System.out.println(str1 == str3);
		 * 
		 * System.out.println("************************");
		 * 
		 * System.out.println(str1.equals(str2)); System.out.println(str1.equals(str3));
		 */
	}

}
