package Week2;

import java.util.Scanner;

public class RecursiveWithoutLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = input.nextInt();
        printNumbers(n);
    }

    public static void printNumbers(int n) {
        // Base case: If n is 0 or negative, terminate the operation and return.
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        // Forward operation: Subtract 5 from n and print the result to the screen.
        System.out.print(n + " ");
        printNumbers(n - 5);

        // Backward operation: Add 5 to n and print the result to the screen.
        System.out.print(n + " ");
    }
}
