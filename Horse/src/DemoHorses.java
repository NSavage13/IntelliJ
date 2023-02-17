

public class DemoHorses {



    public static void main(String[] args) {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();

        horse1.setColor("Brown");
        horse1.setName("Lightning");
        horse1.setBirthYear(2005);

        horse2.setColor("White");
        horse2.setName("Thunder");
        horse2.setBirthYear(2010);
        horse2.setRaces(17);

        horse1.display();
        System.out.println("");
        horse2.display();
        System.out.println("Number of races: " + horse2.getRaces());








    }
}
