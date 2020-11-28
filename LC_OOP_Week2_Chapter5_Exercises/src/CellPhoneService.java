import java.util.*;
public class CellPhoneService {

	public static void main(String[] args) {
		int callMinutes;
		int textAmount;
		int dataUsage;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the minutes you would like to talk each month ------->>>");
		callMinutes = input.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter the amount of texts you would like to send each month ------->>>");
		textAmount = input2.nextInt();
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Please enter the Data Usage (Gigabytes) you use each month ------->>>");
		dataUsage = input3.nextInt();
		
		if ((callMinutes < 500) && (textAmount == 0) && (dataUsage == 0)) {
			System.out.println("You should choose Plan A for $49 pm, you can have 500 talk minutes with no Data and Texts.");
		} 
		else if ((callMinutes < 500) && (100 > textAmount) && (textAmount > 0) && (dataUsage == 0)) {
			System.out.println("You should choose Plan B for $55 pm, you can have 500 talk minutes and any Texts with no Data.");
		} 
		else if ((callMinutes >= 500) && (100 >= textAmount) && (textAmount > 0) && (dataUsage == 0)) {
			System.out.println("You should choose Plan C for $61 pm, you can have more than 500 talk minutes and up to 100 Texts with no Data.");
		} 
		else if ((callMinutes >= 500) && (textAmount > 100) && (dataUsage == 0)) {
			System.out.println("You should choose Plan D for $70 pm, you can have more than 500 talk minutes and more than 100 Texts with no Data.");
		}
		else if ((dataUsage > 0) && (dataUsage <= 3)) {
			System.out.println("You should choose Plan E for $79 pm, you can enjoy talk minutes, Texts and up to 3 Gigabytes Data.");
		}
		else if ((dataUsage > 3)) {
			System.out.println("You should choose Plan E for $79 pm, you can enjoy talk minutes, Texts and more than 3 Gigabytes Data.");
		}
		
		

	}

}
