import java.util.Scanner;

public class DemoCandles {

    public static void main(String[] args) {
        Candle candle1 = new Candle();
        ScentedCandle candle2 = new ScentedCandle();
        Scanner input = new Scanner(System.in);

        candle1.setHeight(7);
        candle1.setColor("Red");

        candle2.setHeight(11);
        candle2.setColor("Brown");

        System.out.println("Select one of our four scents.");
        System.out.println("Vanilla - Caramel - Apple - Pumpkin");
        System.out.print(">>> ");
        String scentPick = input.nextLine();
        candle2.setScent(scentPick);

        candle1.display();
        System.out.println();
        candle2.displayScent();

    }
}
