package liang.hw.chapter05;

import java.util.Scanner;

public class Q01 {

    /* (Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0. Display
the average as a floating-point number.
Enter an integer, the input ends if it is 0: 1 2 -1 3 0
The number of positives is 3
The number of negatives is 1
The total is 5.0
The average is 1.25
     */

    public static void main(String[] args) {
        int userInput;
        int countOfPositives = 0;
        int countOfNegatives = 0;
        int sum = 0;
        double avg = 0;

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Keep entering integers, the input ends if it is 0");

        do {
            userInput = input.nextInt();
            if (userInput > 0) {
                countOfPositives++;
                sum += userInput;
            } else if (userInput < 0) {
                countOfNegatives++;
                sum += userInput;
            }
        }
        while (userInput != 0);
        if (countOfPositives + countOfNegatives != 0) {
            System.out.println("The Number of positives: " + countOfPositives);
            System.out.println("The Number of negatives: " + countOfNegatives);
            System.out.println("The total is: " + sum);
            System.out.println("The average is: " + sum / (countOfPositives + countOfNegatives));
        } else {
            System.out.println("No numbers are entered except 0");
        }
    }
}
