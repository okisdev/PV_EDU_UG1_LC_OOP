import java.util.Scanner;

public class TestScore {

    public static void main(String[] args) {

        int[] ID = {11,22,33,44,55};
        int[] marks = {0,0,0,0,0};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ID.length; i = i + 1) {

            System.out.println("Enter Maths mark(<= 100):");
            marks[i] = sc.nextInt();

            try {

                if (marks[i] > 100) {
                    String ii = "Over the limit: 100.";
                    throw new ScoreException(ii);
                }

            } catch (ScoreException e) {

                marks[i] = 0;
                System.out.println("Type in error.");

            }

        }
        for (int i = 0; i < ID.length; i = i + 1) {
            System.out.println(ID[i] + "'s marks is " + marks[i]);
        }



    }

}
