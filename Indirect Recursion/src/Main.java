import java.util.Scanner;

public class Main {
    public static int methOne(int n){
        if (n>0){
            System.out.println(n);
            n--;
            return methTwo(n);
        }else {
            return n;
        }

    }

    public static int methTwo(int n){
        if (n>0){
            System.out.println(n);
            n--;
            return methOne(n);
        }else {
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer.");
        int number = input.nextInt();

        methOne(number);


    }
}