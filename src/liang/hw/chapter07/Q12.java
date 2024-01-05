package liang.hw.chapter07;

import java.util.Scanner;

public class Q12 {
    /*
    (Reverse an array) The reverse method in Section  7.7 reverses an array by
copying it to a new array. Rewrite the method that reverses the array passed in
the argument and returns this array. Write a test program that prompts the user to
enter ten numbers, invokes the method to reverse the numbers, and displays the
numbers.
     */
    public static void main(String[] args) {
        java.util.Scanner input= new Scanner(System.in);
        int[] intArr= new int[10];
        System.out.println("Please enter 10 integers: ");
        for(int i=0; i<intArr.length; i++){
            intArr[i]=input.nextInt();
        }
       int count=0;
         for(int element: reverse(intArr)){
             System.out.print(element+" ");
         }
        }

        public static int[] reverse(int[] intArr){

        int[] reverseArray=new int[intArr.length];
        for(int i=0, j= reverseArray.length-1; i< reverseArray.length; i++, j--){
            int temp=0;
            temp=intArr[i];
            intArr[i]= reverseArray[j];
            reverseArray[j]=temp;
        }
        return reverseArray;
        }
}
