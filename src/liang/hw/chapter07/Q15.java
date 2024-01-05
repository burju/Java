package liang.hw.chapter07;

import java.util.Scanner;

public class Q15 {
/*
(Eliminate duplicates) Write a method that returns a new array by eliminating the
duplicate values in the array using the following method header:
public static int[] eliminateDuplicates(int[] list)
Write a test program that reads in ten integers, invokes the method, and displays
the result. Here is the sample run of the program:

Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The distinct numbers are: 1 2 3 6 4 5}
 */

    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int[] intArr = new int[10];
        System.out.println("Please enter 10 numbers: ");
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = input.nextInt();
        }
        detectDuplicates(intArr);


    }

    public static void detectDuplicates(int[] intArr) {
        int[] indexOfDuplicates = new int[10];

        int index = 0;
        for (int i = 0, y = i + 1; i < intArr.length-1; i++, y++) {
            if (intArr[i] == intArr[y]) {
                indexOfDuplicates[index] = y;
                index++;
            }

        }
        int[] uniqueArr = clearDuplicates(intArr, indexOfDuplicates);
        for (int i = 0; i < uniqueArr.length; i++) {
            System.out.println(uniqueArr[i] + " ");
        }

    }

    public static int[] clearDuplicates(int[] intArr, int[] indexOfDuplicates) {
        int[] uniqueArr = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            for (int y = 0; y < indexOfDuplicates.length; y++) {
                while (i != indexOfDuplicates[y])
                    uniqueArr[i] = intArr[i];

            }
        }
        return uniqueArr;
    }
}

