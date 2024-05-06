package Week2;

import java.util.Arrays;

public class EvenNumbersInAnArray {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {1, 5, 12, 2, 18, 5, 9, 19, 22, 2, 2, 10, 14, 82, 82, 90};
        int[] uniqueEvenNumbers = new int[list.length]; // To store unique even numbers

        int uniqueIndex = 0; // Index of unique even numbers

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0 && !isFind(uniqueEvenNumbers, list[i])) { // Checks for even number and uniqueness
                uniqueEvenNumbers[uniqueIndex++] = list[i]; // Adds unique even numbers to the array
            }
        }

        // Prints unique even numbers
        for (int value : uniqueEvenNumbers) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}