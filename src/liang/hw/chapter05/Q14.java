package liang.hw.chapter05;

import java.util.Scanner;

public class Q14 {
    /*(Compute the greatest common divisor) Another solution for Listing 5.9 to find
the greatest common divisor of two integers n1 and n2 is as follows: First find d
to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
a divisor for both n1 and n2 in this order. The first such common divisor is the
greatest common divisor for n1 and n2. Write a program that prompts the user to
enter two positive integers and displays the gcd.
     */
    public static void main(String[] args) {
        int n1;
        int n2;
        int gcd=1;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 positive integers");
        n1 = input.nextInt();
        n2 = input.nextInt();

        if (n1 < 0 || n2 < 0) {
            System.out.println("please enter positive integers only");
        } else {
            //find the biggest of 2 numbers
            if (n1 > n2) {
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            //find the gcd
            for (int i = n1; i > 0; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                    break;
                }
            }
        }
        System.out.println("The greatest comman denominator is: "+ gcd);
    }
}

