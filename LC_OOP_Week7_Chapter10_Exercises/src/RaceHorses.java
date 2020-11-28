import java.util.Scanner;

public class RaceHorses extends Horse{

    int numberOfRaces;

    Scanner sc = new Scanner(System.in);

    public int getNumberOfRaces() {
        return numberOfRaces;
    }

    public void setNumberOfRaces() {
        System.out.println("Number of Races:");
        this.numberOfRaces = sc.nextInt();
    }
}
