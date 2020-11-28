import java.util.*;

public class TwelveDays {

	public static void main(String[] args) {
		
		int input;
		
		String date = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("When is the day you start your song?");
		input = sc.nextInt();
		
		if (input == 1) {
			date = "st";
		} else if (input == 2) {
			date = "nd";
		} else if (input == 3) {
			date = "rd";
		} else if (input > 3) {
			date = "th";
		}
		
		System.out.println("\nOn the " + input + date + " day of Christmas.");
		System.out.println("My true love gave to me");
		
		
		switch(input) {
			case 1:
				System.out.println("A partridge in a pear tree");
			case 2:
		        System.out.println("Two turtle doves and");
			case 3:
		        System.out.println("Three French hens");
			case 4:
		        System.out.println("Four calling birds");
			case 5:
		        System.out.println("Five golden rings");
			case 6:
		        System.out.println("Six geese a-laying");
			case 7:
		        System.out.println("Seven swans a-swimming");
			case 8:
		        System.out.println("Eight maids a-milking");
			case 9:
		        System.out.println("Nine ladies dancing");
			case 10:
		        System.out.println("Ten lords a-leaping");
			case 11:
		        System.out.println("Eleven pipers piping");  
	        case 12:
	            System.out.println("Twelve drummers drumming");
	            break;
	        default:
	            System.out.println("Invalid choice");
	   }

	}

}
