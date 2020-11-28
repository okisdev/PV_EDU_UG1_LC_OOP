import java.util.Scanner;

public class BadSubscriptCaught {

    public static void main(String[] args) {

        String[] name = {"A", "B", "C", "D", "E", "F", "G", "H"};
        int input;

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Please enter an int:");
            input = sc.nextInt();
            System.out.println("Name is " + name[input]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Subscript out of range.");

        }
    }

}
