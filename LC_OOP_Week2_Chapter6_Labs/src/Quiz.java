import java.util.*;
public class Quiz {

	public static void main(String[] args) {
		int a;
		int point = 0;
		int total;
		String q1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which is the best music in the world? \n"
				+ "A.Soft \t"
				+ "B.Band \t");
		q1 = input.nextLine();
		
		if (q1 == "A") {
			point += 1;
			System.out.println("Correct! Congratulations! You earn 1 point.");
		}
		
		System.out.println("The total points you earn is " + point);

	}

}
