import java.util.*;
public class Strings_5 {

	public static void main(String[] args) {
		String babyname1;
		String babyname2;
		String babyname3;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first baby name ------>>>");
		babyname1 = input.nextLine();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter the second baby name ------>>>");
		babyname2 = input2.nextLine();
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Please enter the third baby name ------>>>");
		babyname3 = input3.nextLine();
		
		System.out.println(babyname1 + ", " +babyname2 + ", " + babyname3);
		System.out.println(babyname1 + ", " +babyname3 + ", " + babyname2);
		System.out.println(babyname2 + ", " +babyname1 + ", " + babyname3);
		System.out.println(babyname2 + ", " +babyname3 + ", " + babyname1);
		System.out.println(babyname3 + ", " +babyname1 + ", " + babyname2);
		System.out.println(babyname3 + ", " +babyname2 + ", " + babyname1);

	}

}
