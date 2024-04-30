package Week2;

import java.util.Scanner;

public class palindromicNumbers {

    // A method that checks whether a number is palindromic or not
    static boolean isPalindrome(int number) {
        int temp = number, reversedNumber = 0, lastDigit;

        // Finding the reverse of the number
        while (temp != 0) {
            lastDigit = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            temp /= 10;
        }

        // Comparing the number with its reverse
        return (number == reversedNumber);
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        // Getting a number from the user
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        // Checking for Palindromicity and printing the result to the screen
        if (isPalindrome(number))
            System.out.print(number + " bir palindromik sayıdır.");
        else
            System.out.print(number + " bir palindromik sayı değildir.");
    }
}
