import java.util.Scanner;

public class AddingRecursively2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();
        int sum;
        if (num2 <= num1) {
            sum = recursiveSum(num2, num1);
            System.out.println("The sum of integers between " + num2 + " and " + num1 + " is " + sum);
        } else {
            sum = recursiveSum(num1, num2);
            System.out.println("The sum of integers between " + num1 + " and " + num2 + " is " + sum);
        }
    }

    public static int recursiveSum(int low, int high) {
        if (low == high) {
            return low;
        } else {
            return high + recursiveSum(low, high-1);
        }
    }
}
