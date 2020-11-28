import java.util.*;
public class MinutesCoversion {

	public static void main(String[] args) {
		int mins;
		double hours;
		double days;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please type in the minutes you want to calculate ------>>>");
		mins = input.nextInt();
		
		hours = mins / 60;
		days = hours/ 24;
		
		System.out.println( +mins +" minutes equals " +hours +" hours and equals " +days +" days.");

	}

}
