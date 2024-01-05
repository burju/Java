package liang.hw.chapter07;

import java.util.Scanner;

public class Q08 {
    /*
    (Average an array) Write two overloaded methods that return the average of an
array with the following headers:
public static double average(double[] array)
Write a test program that prompts the user to enter ten double values, invokes this
method, and displays the average value
     */

    public static void main(String[] args) {
        //prompt user to enter 10 double values.
        java.util.Scanner input= new Scanner(System.in);
        double[] doubleArr= new double[10];

        System.out.println("Please enter 10 double numbers: ");
        for(int i=0; i< doubleArr.length; i++){
            doubleArr[i]= input.nextDouble();
                   }
        //call method that gets the avg & display.
        average(doubleArr);
    }

   //double average method
   public static void average(double[] array){
        double sum=0;
        for(int i=0;i< array.length; i++){
            sum+=array[i];
        }
        System.out.println("The average of the array elements is: "+ sum/ array.length);
    }
    //int version of the same method:
    public static void average(int[] arr){
        int sum=0;
        for(int i=0;i< arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("The average of the array elements is: "+ sum/ arr.length);
    }

}
