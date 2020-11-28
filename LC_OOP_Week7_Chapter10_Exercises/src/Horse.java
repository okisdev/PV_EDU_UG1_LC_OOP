import java.util.Scanner;

public class Horse {

    Scanner sc = new Scanner(System.in);

    private String name;
    private String colour;
    private int birthYear;

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("name:");
        this.name = sc.nextLine();
    }

    public String getColour() {
        return colour;
    }

    public void setColour() {
        System.out.println("colour:");
        this.colour = sc.nextLine();
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear() {
        System.out.println("Birth Year:");
        this.birthYear = sc.nextInt();
    }
}
