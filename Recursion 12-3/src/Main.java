import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int maxIndex = numbers[numbers.length - 1];
        Scanner input = new Scanner(System.in);
        int start;
        int end;
        do {
            System.out.print("Enter the starting position (0-" + maxIndex + "): ");
            start = input.nextInt();
        } while (start < 0 || start > maxIndex);
        System.out.println("Starting position is: " + start);

        do {
            System.out.print("Enter the ending position (" + start + "-" + maxIndex + "): ");
            end = input.nextInt();
        } while (end < start || end > maxIndex);
        System.out.println("Start: " + start);
        System.out.println("End: " + end);
        displayValuesInRange(numbers, start, end);
        int total = sumOfRange(numbers, start, end);
        System.out.println(total);


    }

    private static void displayValuesInRange(int[] array, int start, int end) {
        System.out.println("Values in the range:");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i - 1] + " ");

        }
        System.out.println();
    }

    // •Include a recursive method that sums all the values in the requested range. The method accepts the array, the starting position, and the ending position. The base case occurs when the starting position is greater than the ending position; if so, the method returns 0. Otherwise, the recursive cases return the value at the current starting position plus a new call to the method. The three arguments passed to the new method call are the array, the current starting position plus one, and the ending position.
    public static int sumOfRange(int[] array,int start,int end){
        if (start > end){
            return 0;
        }else{
            return array[start] + sumOfRange(array, start + 1, end);
        }
    }
}


