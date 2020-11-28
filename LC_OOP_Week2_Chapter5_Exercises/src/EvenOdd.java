import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		int a;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an Integer here ---------->>>");
		a = input.nextInt();
		
		if (a / 2 == 0)
			System.out.println("You enter an Even Integer, which is " +a + ".");
		
		if (a / 2 != 0)
			System.out.println("You enter an Odd Integer, which is " +a + ".");

	}

}
