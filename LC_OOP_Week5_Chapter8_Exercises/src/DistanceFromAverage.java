import java.util.*;
	public class DistanceFromAverage {
		
		private static double[] inputNumValues = new double[15];
		private static double inputNum;
		private static double average;
		private static double distance;
		private static int totalInputTimes = 1;
		private static double totalInputNum = 0;
		private static int a = 1;
		
		static String show;
		
	
	public static void calAverage() {
		
		average = totalInputNum / totalInputTimes;
		
	}
	
	public static void calDistance() {
			
		distance = inputNumValues[a] - average;
		a = a + 1 ;
	
	}
	
	public static void display() {
		
		calAverage();
		
		calDistance();
		
		System.out.println("Total amount of numbers you entered is " + totalInputTimes + ", this number you entered is " + inputNum +", which is " + distance + " far away the average" + ", all numbers' average is " + average);
		
	}
	

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any number you like, enter 99999 to quit.");
		inputNum = input.nextDouble();
		
		
		if (inputNum == 99999) {
			System.out.println("You haven't enter a number, please enter a number:");
			inputNum = input.nextDouble();
		}
		
		while ((inputNum != 99999) && (totalInputTimes < inputNumValues.length)) {
			
			totalInputTimes = totalInputTimes + 1;
			totalInputNum = totalInputNum + inputNum;
			inputNumValues[totalInputTimes] = inputNum;
			System.out.println("Please enter any number you like, or enter 99999 to quit.");
			inputNum = input.nextDouble();		
	
			if (inputNum == 99999) {
				break;
			}
			
			display();
		}	
	
		
		
	}
}
