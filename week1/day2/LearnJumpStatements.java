package week1.day2;

public class LearnJumpStatements {

	public static void main(String[] args) {


		for (int i = 1; i <= 5; i++) {
			
			if(i == 3) {
				System.out.println("Three");
				//continue; // stop the current iteration and continue with next iteration;
				break; //it stop the iterations and come out of the loop
			}
			System.out.println(i);
			
		}

	}

}
