package Week2;

import java.util.Scanner;

public class PrimeNumbers {
    // Method to check if a given number is prime or not
    static void prime() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int num = input.nextInt();
        // Initialize a boolean variable to indicate if the number is prime
        boolean isPrime = true;
        // If the number is less than or equal to 1, it's not prime
        if (num <= 1) {
            isPrime = false;
        } else {
            // Iterate from 2 up to (num - 1) to check for factors
            for (int i = 2; i < num; i++) {
                // If the number is divisible by any number other than 1 and itself, it's not prime
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        // Output the result based on whether the number is prime or not
        if (isPrime) {
            System.out.println(num + " sayısı ASALDIR !");
        } else {
            System.out.println(num + " sayısı ASAL değildir.");
        }
    }
    // Method to keep checking for prime numbers indefinitely
    public static void main(String[] args) {
        while (true) {
            prime();
        }
    }
}