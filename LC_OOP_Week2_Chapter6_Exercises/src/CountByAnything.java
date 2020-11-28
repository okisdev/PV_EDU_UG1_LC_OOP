import java.util.*;
public class CountByAnything {

	public static void main(String[] args) {
		int x;
		int y;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number you would like to count: ");
		x = input.nextInt();
		System.out.println();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter a number you would like to end: ");
		y = input2.nextInt();
		System.out.println();
		
		for (x++; x < y; x = x+5 ) {
			System.out.println(x);
			if (x%10==0)
				System.out.println();
		}

	}

}
