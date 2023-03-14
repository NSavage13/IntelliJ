import java.util.Scanner;

public class VeeRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of the V: ");
        int height = sc.nextInt();

        // Call the recursive method to print the V
        printVee(1, height, height - 1, 0);
    }

    public static void printVee(int lineNumber, int numLines, int numSpacesBefore, int numSpacesBetween) {
        // Base case: If the current line number exceeds the total number of lines, return
        if (lineNumber > numLines) {
            return;
        }

        printVee(lineNumber + 1, numLines, numSpacesBefore - 1, numSpacesBetween + 2);

        // Print the spaces before the first letter of the line
        for (int i = 0; i < numSpacesBefore; i++) {
            System.out.print(" ");
        }

        // Print the first letter of the line
        System.out.print("V");

        // Print the spaces between the letters of the line
        for (int i = 0; i < numSpacesBetween; i++) {
            System.out.print(" ");
        }

        // Print the second letter of the line
        System.out.println("V");



    }
}
