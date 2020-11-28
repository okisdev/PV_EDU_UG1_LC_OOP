import java.util.*;

public class DemoCandles {

    public static void main(String[] args) {

        Candle candleA = new Candle();
        ScentedCandle candleB = new ScentedCandle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter candleA colour: ");
        candleA.setColour(sc.nextLine());

        System.out.println("Enter candleA height: ");
        candleA.setHeight(sc.nextDouble());


        System.out.println();

        System.out.println("Enter candleB colour: ");
        candleB.setColour(sc.nextLine());

        System.out.println("Enter candleB height: ");
        candleB.setHeight(sc.nextDouble());

        System.out.println("Enter candleB scent: ");
        candleB.setScent(sc.nextLine());


        System.out.println("candleA's colour is " + candleA.getColour() + ", height is " + candleA.getHeight() + ", price is " + candleA.getPrice());
        System.out.println("candleB's colour is " + candleB.getColour() + ", height is " + candleB.getHeight() + ", scent is " + candleB.getScent() + ", price is " + candleA.getPrice());
    }

}
