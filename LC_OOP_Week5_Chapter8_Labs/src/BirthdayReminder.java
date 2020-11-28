import java.util.*;
public class BirthdayReminder {
	
	final static int MAX_NUM = 10;
	final static String sentinelValue = "ZZZ";
	
	static String name = null;
	static String birthday = null;
	
	static String[] nameArray = new String[10];
	static String[] birthdayArray = new String[10];
	
	
	public static void main(String args[]) {
		
		int num = 0;
		int a;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your friends' name, or enter \"ZZZ\" to quit");
		name = input.nextLine();
		
		
		
		if (name.equals(sentinelValue)) {
			System.out.println("You haven't enter a name, please enter a name first");
		}
		
		if (!name.equals(sentinelValue)) {
			while (!name.equals(sentinelValue) && num < MAX_NUM) {
				
				System.out.println("Please enter your friends' birthday, like 01-July-2000");
				birthday = input.nextLine();
				
				nameArray[num] = name;
				birthdayArray[num] = birthday;
				
				System.out.println("Please enter your another friends' name, or enter \"ZZZ\" to quit");
				name = input.nextLine();
				
				num = num + 1 ;
			}
			
			System.out.println("Total enter number of friends is " + num);
			System.out.println("They are:");
			
			for (a = 0; a<num; a=a+1) {
				System.out.println(nameArray[a] + " and the birthday is: " + birthdayArray[a]);
			}
		}
		
		
		
		
		
		
	}
}
