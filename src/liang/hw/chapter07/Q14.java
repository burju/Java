package liang.hw.chapter07;

import java.util.Scanner;

public class Q14 {
    /*
    (Computing gcd) Write a method that returns the gcd of an unspecified number
of integers. The method header is specified as follows:
public static int gcd(int... numbers)
Write a test program that prompts the user to enter five numbers, invokes the
method to find the gcd of these numbers, and displays the gcd.
     */
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Please enter 5 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int gcd = findGCD(arr);
        System.out.println("the greatest common denominator is: " + gcd);

    }

    public static int findGCD(int[] arr) {
        int gcd = 1;
        boolean isgcd = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % arr[i] == 0) {
                        isgcd = true;
                    } else {
                        isgcd = false;
                        break;
                    }
                if (isgcd) {
                    gcd=arr[i];
                }
                }
        }
        return gcd;

    }
}
