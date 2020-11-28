import java.util.*;
public class Eggs {

	public static void main(String[] args) {
		int totalEggs;
		int dozenEggs;
		int looseEggs;
		int totalPrice;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type in how many eggs you want to buy ------>>>");
		totalEggs = input.nextInt();
		
		dozenEggs = totalEggs / 12 ;
		looseEggs = totalEggs % 12 ;
		
		totalPrice = (int) (dozenEggs * 3.25 + looseEggs * 45/100) ;
		
		System.out.println("You ordered " +totalEggs + " Eggs. "
				+ "That's " +dozenEggs + " dozen at $3.25 per dozen "
						+ "and " +looseEggs + " loose eggs at 45 cents each "
								+ "for a total of " +totalPrice + " .");

	}

}
