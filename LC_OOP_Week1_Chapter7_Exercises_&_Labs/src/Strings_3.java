import java.util.*;
public class Strings_3 {
	public static void main(String[] args) {
		String number;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your mobile phone number ------>>>");
		number = input.nextLine();
		
		String str = String.valueOf(number);
		int digit = str.length();
		
		System.out.println("Your Mobile Phone Number is: " + number);
		System.out.println("The number of digits is: " + digit);
		
	}

}
