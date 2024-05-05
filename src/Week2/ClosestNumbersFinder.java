package Week2;

import java.util.Scanner;

public class ClosestNumbersFinder {

    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        //We initially assign the minimum and maximum values of the array as the first element of the array
        int min = list[0];
        int max = list[0];

        //We are finding the minimum value of the array
        for (int i : list) {
            if (i < n) {
                min = i;
                break;
            }
        }
        //We are finding the maximum value of the array
        for (int i : list) {
            if (i > n) {
                max = i;
                break;
            }
        }

        //We are traversing through the numbers in the array to find the closest number smaller than the entered number.
        for (int i : list) {
            if (i < n && i > min) {
                min = i;
            }
            if (i > n && i < max) {
                max = i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
    }
}
