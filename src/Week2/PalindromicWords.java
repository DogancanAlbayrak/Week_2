package Week2;

import java.util.Scanner;

public class PalindromicWords {

    static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equalsIgnoreCase(reverse);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Bir Kelime Girin: ");
        String word = input.nextLine().toUpperCase();

        if (isPalindrome(word)) {
            System.out.println("Palindromik kelimedir.");
        } else {
            System.out.println("Palindromik kelime değildir.");
        }
    }
}
