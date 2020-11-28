import java.util.*;
public class InchConversion {

	public static void main(String[] args) {
		double inches;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any inches you want: ");
		inches = input.nextDouble();
		
		
		System.out.println();
		
		System.out.println(inches + " is equal to " + tofeet(inches) + " feet, and it is also equal to " + toyards(inches) + " yards.");

	}
	
	
	public static double tofeet(double inches) {
		double b;
		
		b = inches / 12;
		
		return b;
	}
	
	public static double toyards(double inches) {
		double b;
		
		b = inches / 36;
		
		return b;
	}

}
