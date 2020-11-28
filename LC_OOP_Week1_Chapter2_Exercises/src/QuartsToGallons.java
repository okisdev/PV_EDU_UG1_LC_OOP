import java.util.*;
public class QuartsToGallons {

	public static void main(String[] args) {
		int Quarts_To_Gallon = 4;
		int QuartsNeeded = 18;
		int GallonNeeded;
		int RemainQuartsNeeded;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Quarts Needed ----->>>");
		QuartsNeeded = input.nextInt();
		
		GallonNeeded = QuartsNeeded / Quarts_To_Gallon;
		RemainQuartsNeeded = QuartsNeeded % Quarts_To_Gallon;
		
		System.out.println("A job that needs " +QuartsNeeded + " quarts requires " +GallonNeeded + " gallons plus " +RemainQuartsNeeded + " quarts.");

	}

}
