import java.util.*;
public class MileConversions {

	public static void main(String[] args) {
		int miles;
		int inches;
		int feet;
		int yards;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please type in the miles you want ------>>>");
		miles = input.nextInt();
		
		inches = miles * 63360;
		feet = miles * 5280;
		yards = miles * 1760;
		
		System.out.println("The miles you type is " 
		+miles + " equals \n " 
		+inches + " inches \n or " 
		+feet + " feet \n or " 
		+yards + " yards.");

	}

}
