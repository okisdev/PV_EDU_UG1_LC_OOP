import java.util.Scanner;

public class Strings_4 {

	public static void main(String[] args) {
		String firstname;
		String lastname;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your First Name ------->>>");
		firstname = input.nextLine();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter your Last Name ------->>>");
		lastname = input2.nextLine();
		
		String firstnameupper = firstname.toUpperCase();
		String lastnameupper = lastname.toUpperCase();

		System.out.println("Input ->>> " +firstname + " " +lastname);
		System.out.println(firstnameupper + " "+ lastnameupper);

	}

}
