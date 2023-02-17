import java.util.Scanner;

public class DemoTees {

    public static int getOrderNumber(Scanner input) {
        System.out.print("Enter order number: ");
        return input.nextInt();
    }

    public static String getSize(Scanner input) {
        System.out.print("Enter size (S, M, L, XL, XXL, XXXL): ");
        return input.next();
    }

    public static String getColor(Scanner input) {
        System.out.print("Enter color: ");
        return input.next();
    }

    public static String getSlogan(Scanner input) {
        System.out.print("Enter slogan: ");
        return input.next();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create two TeeShirt objects
        System.out.println("Enter details for TeeShirt 1:");
        TeeShirt shirt1 = new TeeShirt(getOrderNumber(input), getSize(input), getColor(input));
        System.out.println("TeeShirt 1 details: \n" + shirt1.getOrderNumber() + ", " + shirt1.getSize() + ", " + shirt1.getColor() + ", " + shirt1.getPrice());

        System.out.println("Enter details for TeeShirt 2:");
        TeeShirt shirt2 = new TeeShirt(getOrderNumber(input), getSize(input), getColor(input));
        System.out.println("TeeShirt 2 details: " + shirt2.getOrderNumber() + ", " + shirt2.getSize() + ", " + shirt2.getColor() + ", " + shirt2.getPrice());

        // Create two CustomTee objects
        System.out.println("Enter details for CustomTee 1:");
        CustomTee custom1 = new CustomTee(getOrderNumber(input), getSize(input), getColor(input), getSlogan(input));
        System.out.println("CustomTee 1 details: \n" + custom1.getOrderNumber() + ", " + custom1.getSize() + ", " + custom1.getColor() + ", " + custom1.getPrice() + ", " + custom1.getSlogan());

        System.out.println("Enter details for CustomTee 2:");
        CustomTee custom2 = new CustomTee(getOrderNumber(input), getSize(input), getColor(input), getSlogan(input));
        System.out.println("CustomTee 2 details: " + custom2.getOrderNumber() + ", " + custom2.getSize() + ", " + custom2.getColor() + ", " + custom2.getPrice() + ", " + custom2.getSlogan());
    }






}

