public class DemoHorse {

    public static void main(String[] args) {

        Horse horse = new Horse();
        RaceHorses RH = new RaceHorses();

        horse.setName();
        horse.setColour();
        horse.setBirthYear();

        RH.setNumberOfRaces();

        System.out.println("Horse name is " + horse.getName() + ", horse colour is " + horse.getColour() + ", and it's birth year is " + horse.getBirthYear() + " and the number of races is " + RH.getNumberOfRaces());

    }
}
