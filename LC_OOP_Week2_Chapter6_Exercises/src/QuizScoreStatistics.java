import java.util.*;
public class QuizScoreStatistics {

	public static void main(String[] args) {
		int inputScore = 0;
		int avg = 0;
		int sum = 0;
		int total = 0;
		int highest = 0;
		int lowest = 10;
		
		
		
		while (inputScore != 99) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter scores: ");
			inputScore = input.nextInt();
			
			if ((inputScore < 0) || (inputScore >10)) {
				System.out.println("The score you enter is invaild, Please re-enter: ");
				Scanner input2 = new Scanner(System.in);
				inputScore = input2.nextInt();
			}
			else {
				System.out.println("Please continue to enter, enter 99 to quit.");
				sum = sum + inputScore;
				total += 1;
				
				if (inputScore > highest)
					highest = inputScore ;
				
				if (inputScore < lowest)
					lowest = inputScore ;
			}
			
			avg = sum / total;
			
		}
	
		System.out.println("Total enter numbers of Scores is " +total + ".");
		System.out.println("The highest Scores is " +highest + ".");
		System.out.println("The lowest Scores is " +lowest + ".");
		System.out.println("The average of Scores is " +avg + ".");

	}

}
