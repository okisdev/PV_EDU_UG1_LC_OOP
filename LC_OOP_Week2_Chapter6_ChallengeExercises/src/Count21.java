import java.util.*;

public class Count21 {

	public static void main(String[] args) {
		
		final int FINAL_VALUE = 21;
		int input;
		int computer;
		int total = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: (Range: 1 to 3)");
		input = sc.nextInt();
		
		while ((input > 3) || (input < 1)) {
			
			System.out.println("Invalid input, please re-enter:");
			input = sc.nextInt();
		
		}
		
		while (total < FINAL_VALUE) {
			
			total = total + input;
			System.out.println("What you input is " + input + ", so the total now is " + total);
			
			if (input == 1) {
				computer = 3;
			} else if (input == 2) {
				computer = 2;
			} else {
				computer = 1; 
			}
			
			total = total + computer;
			System.out.println("What Computer input is " + computer + ", so the total now is " + total);
			
			System.out.println("Please enter a number: (Range: 1 to 3)");
			input = sc.nextInt();
			
			while ((input > 3) || (input < 1)) {
				
				System.out.println("Invalid input, please re-enter:");
				input = sc.nextInt();
				
			}
			
		}
		
		System.out.println("Sorry, you lose.");

	}

}
