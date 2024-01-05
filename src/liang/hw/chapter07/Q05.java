package liang.hw.chapter07;

import java.util.Scanner;

public class Q05 {/*
(Print distinct numbers) Write a program that reads in ten numbers and displays
the number of distinct numbers and the distinct numbers separated by exactly one
space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
Read a number and store it to an array if it is new. If the number is already in the
array, ignore it.) After the input, the array contains the distinct numbers. Here is
the sample run of the program
*/

    public static void main(String[] args) {
        //ask for user input and store all inputs to an array:
        java.util.Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int userInput;

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            userInput = input.nextInt();
            if (isUnique(userInput, arr)) {
                arr[i] = userInput;
            }
        }
        //print unique array:
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0)
                System.out.print(arr[i] + " ");
        }
    }

    public static boolean isUnique(int userInput, int[] arr) {
        boolean isUnique = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == userInput) {
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }
}
