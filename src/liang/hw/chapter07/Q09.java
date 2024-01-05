package liang.hw.chapter07;

import java.util.Scanner;

public class Q09 {
    /*
    (Find the smallest element) Write a method that finds the smallest element in an
array of double values using the following header:
public static double min(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the minimum value, and displays the minimum value. Here is a
sample run of the program:
Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
The minimum number is: 1.5
     */
    public static void main(String[] args) {
        //prompt user to enter 10 double values.
        java.util.Scanner input = new Scanner(System.in);
        double[] doubleArr = new double[10];
        System.out.println("Please enter 10 double numbers: ");
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = input.nextDouble();
        }

        printArr(min(doubleArr));

    }

    //METHODS:
    public static double min(double[] arr) {
        double min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                }
            }
        }
        return min;
    }

    public static void printArr(double min) {
        System.out.println(" The smalest element in the array is: " + min);
    }
}
