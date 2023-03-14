import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = input.nextInt();
        solveTowerOfHanoi(n, 1, 3, 2);
    }

    public static void solveTowerOfHanoi(int n, int start, int end, int spare) {
        if (n == 1) {
            System.out.println("Move the disk from " + start + " to " + end);
        } else {
            solveTowerOfHanoi(n - 1, start, spare, end);
            System.out.println("Move the disk from " + start + " to " + end);
            solveTowerOfHanoi(n - 1, spare, end, start);
        }
    }
}
   /*   We call solveTowerOfHanoi(3, 1, 3, 2).

        Since n is greater than 1, we call solveTowerOfHanoi(2, 1, 2, 3).

        Since n is greater than 1, we call solveTowerOfHanoi(1, 1, 3, 2).

        Since n equals 1, we print "Move the disk from 1 to 3".

        We return to the previous recursive call, which is solveTowerOfHanoi(2, 1, 2, 3).

        We print "Move the disk from 1 to 2".

        Since n is greater than 1, we call solveTowerOfHanoi(1, 3, 2, 1).

        Since n equals 1, we print "Move the disk from 3 to 2".

        We return to the previous recursive call, which is solveTowerOfHanoi(2, 1, 2, 3).

        Since n equals 1, we print "Move the disk from 1 to 3".

        We return to the first recursive call, which is solveTowerOfHanoi(3, 1, 3, 2).

        We print "Move the disk from 2 to 1".

        Since n is greater than 1, we call solveTowerOfHanoi(2, 3, 1, 2).

        Since n equals 1, we print "Move the disk from 3 to 2".

        We return to the previous recursive call, which is solveTowerOfHanoi(2, 3, 1, 2).

        We print "Move the disk from 2 to 3".

        Since n equals 1, we print "Move the disk from 1 to 3". */

