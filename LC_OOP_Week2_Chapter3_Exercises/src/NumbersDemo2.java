import java.util.Scanner;
public class NumbersDemo2 {

	public static void main(String[] args) {
		int x, y;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		x = input.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter the second number: ");
		y = input2.nextInt();
		
		System.out.println("For the first number " +x + ":");
		System.out.println("Twice The Number is " +displayTwiceTheNumber(x) );
		System.out.println("Number Plus Five " +displayNumberPlusFive(x) );
		System.out.println("Number Squared is " +displayNumberSquared(x) );
		
		System.out.println();
		
		System.out.println("For the second number " +y + ":");
		System.out.println("Twice The Number is " +displayTwiceTheNumber(y) );
		System.out.println("Number Plus Five " +displayNumberPlusFive(y) );
		System.out.println("Number Squared is " +displayNumberSquared(y) );

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
