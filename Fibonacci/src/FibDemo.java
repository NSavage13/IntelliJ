import java.util.Scanner;

public class FibDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive ending value: ");
        int endingValue = input.nextInt();

        System.out.println("Fibonacci sequence up to " + endingValue + ":");
        for (int i = 1; i <= endingValue; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
