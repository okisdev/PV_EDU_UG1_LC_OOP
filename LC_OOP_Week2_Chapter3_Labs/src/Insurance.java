import java.util.Scanner;

class Insurance {

  public static void main(String args[]) {

    int currentYear;
    int birthYear;
    int premium;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the current year >> ");
    currentYear = input.nextInt();

    System.out.print("Enter the birth year >> ");
    birthYear = input.nextInt();

    premium = calculatePremium(currentYear, birthYear);
    System.out.println("The premium is $" + premium);

  }

  public static int calculatePremium(int current, int birth) {

    final int ADDITION = 15;
    final int MULTIPLICATION = 20;
    int age = current - birth;
    int decade = age / 10;
    int premium = (ADDITION + decade) * MULTIPLICATION;

    return premium;

  }
}
