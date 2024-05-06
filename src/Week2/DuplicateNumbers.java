package Week2;

public class DuplicateNumbers {
    // Method to check if a value exists in an array
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Given array with duplicate numbers
        int[] list = {3, 7, 15, 21, 8, 12, 9, 28, 35, 18, 25, 14, 6, 30, 42, 50, 21, 9, 14};
        // Print statement for duplicate numbers
        System.out.println("Tekrar eden sayılar:");
        // Loop through the array to find duplicates
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) { // If a duplicate is found, print it
                    System.out.println(list[i]);
                    break; // Break the loop to avoid printing the same number multiple times
                }
            }
        }
    }
}
