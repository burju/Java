package liang.hw.chapter07;

import java.util.Scanner;

public class Q10 {
    /*
    (Find the index of the smallest element) Write a method that returns the index of
the smallest element in an array of integers. If the number of such elements is
greater than 1, return the smallest index. Use the following header:
public static int indexOfSmallestElement(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the index of the smallest element, and displays the index
     */

    public static void main(String[] args) {
        java.util.Scanner input= new Scanner(System.in);
        int[] intArr= new int[10];
        System.out.println("Please enter 10 integers: ");
        for(int i=0; i<intArr.length; i++){
            intArr[i]=input.nextInt();
        }
        int indexOfSmallestElement= indexOfSmallestElement(intArr);
        System.out.println("The index of the smallest element is: "+ indexOfSmallestElement);
    }

    public static int indexOfSmallestElement(int[] intArr){
        int smallest= intArr[0];
        int index=0;

        for(int i=1; i<intArr.length; i++){
            if(smallest>intArr[i]){
                smallest=intArr[i];
                index=i;
            }
        }
        return index;
    }
}
