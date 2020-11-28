import java.util.Arrays;
import java.util.Scanner;

public class TimesAndInstructors {

    public static void main(String[] args) {

        String table[][]= new String[6][2];

        table[0][0] = "I01";
        table[0][1] = "A";

        table[1][0] = "I02";
        table[1][1] = "B";

        table[2][0] = "I03";
        table[2][1] = "C";

        table[3][0] = "I01";
        table[3][1] = "A";

        table[4][0] = "I04";
        table[4][1] = "D";

        table[5][0] = "I05";
        table[5][1] = "D";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your course name:");
        String name = sc.nextLine();

        int inlist = Arrays.binarySearch(table[], name);


        System.out.println(name);

    }
}
