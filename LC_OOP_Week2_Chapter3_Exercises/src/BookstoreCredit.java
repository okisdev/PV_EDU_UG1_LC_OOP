import java.util.*;
public class BookstoreCredit {

	public static void main(String[] args) {
		String name;
		double avg;
		int times10;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Student's Name: ");
		name = input.nextLine();
		
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter Student's Grade Point Average: ");
		avg = input2.nextDouble();
		

		

		System.out.println("The student name is " + name + "\n"
				+ "Student's Grade Point Average is " + avg + "\n"
				+ "the credit is " + info(avg) + " ." );
		
		
		
	}
	
	public static double info(double avg) {
		double times;
		
		times = (int) (avg * 10);
		
		return times;
		
	}

}
