package Week2;

import java.util.Scanner;

public class Exponentiation {

    // Method for exponentiation operation
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");// Prompting the user to enter the base value
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");// Prompting the user to enter the exponent value
        int exponent = scan.nextInt();
        int result = 1;
        // Loop to calculate the result by multiplying the base by itself exponent times
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç : " + result);// Displaying the result
    }

    public static void main(String[] args) {
        while (true) {
            power();// Calling the power method to perform exponentiation operation
        }
    }
}
