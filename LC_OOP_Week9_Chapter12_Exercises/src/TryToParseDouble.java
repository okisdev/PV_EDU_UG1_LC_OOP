import java.util.Scanner;

public class TryToParseDouble {

    public static void main(String[] args) {

        double input;

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Please enter a double number:");
            input = Double.parseDouble(sc.nextLine());


        } catch (NumberFormatException e) {

            input = 0;
            System.out.println("Number format error.");

        }


    }


}
