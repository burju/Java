package liang.hw.chapter05;

import java.util.Scanner;

public class Q16 {
    /*(Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in increasing order. For example, if the input integer is
120, the output should be as follows: 2, 2, 2, 3, 5. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int divisor = 2;

        System.out.println("Please an integer and we will display all its smallest factors in the increasing order");
        int number = input.nextInt();

        while (divisor <= number) {
            if (number % divisor == 0) {
                System.out.print(divisor + ", ");
                number/=divisor;
            }
            else{
                divisor++;
            }
        }
    }}