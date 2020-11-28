import java.util.*;
public class NumbersDemo {

	public static void main(String[] args) {
		int x;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		x = input.nextInt();
		
		System.out.println("Twice The Number is " +displayTwiceTheNumber(x) );
		System.out.println("Number Plus Five " +displayNumberPlusFive(x) );
		System.out.println("Number Squared is " +displayNumberSquared(x) );
		

	}
	
	public static int displayTwiceTheNumber(int a) {
		int b;
		b = 2 * a;
		return b;
	}
	
	public static int displayNumberPlusFive(int a) {
		int b;
		b = a + 5;
		return b;
	}
	
	public static int displayNumberSquared(int a) {
		int b;
		b = (int) Math.pow(a, 2);
		return b;
		
	}

}
