import java.util.*;

public class RandomGuessMatch {

	public static void main(String[] args) {
		
		final int MIN = 1;
		final int MAX = 5;
		
		int random;
		int guess;
		
		String IfMatch;
		
		random = MIN + (int)(Math.random() * MAX);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please guess a number:(1 < your input < 5)");
		guess = sc.nextInt();
		
		if (random == guess) {
			IfMatch = "match with what you guess.";
		} else {
			IfMatch = "not match with what you guess.";
		}
		
		System.out.println("What you guess is " + guess + ", it is " + (random - guess) + " away from the random number");
		System.out.println("The random number is " + random + ", it is " + IfMatch + ".");
		
	}

}
