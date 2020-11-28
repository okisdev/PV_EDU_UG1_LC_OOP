import java.util.*;
public class EvenEntryLoop {

	public static void main(String[] args) {
		int num;
		int inputNum = 0;
		
		
		while (inputNum != 999) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter an enter Even Number, enter 999 to quit: ");
			inputNum = input.nextInt();
				if (inputNum % 2 == 0)
					System.out.println("Good Job! Please continue to enter:");
				else 
					System.out.println("That is not an Even Number.");
		}
		

	}

}
