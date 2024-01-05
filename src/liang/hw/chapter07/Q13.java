package liang.hw.chapter07;

import java.util.Scanner;

public class Q13 {
    /*
    (Random number chooser) Write a method that returns a random number between
1 and 54, excluding the numbers passed in the argument. The method header is
specified as follows:
public static int getRandom(int... numbers)
     */
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int[] arr = new int[2];
        System.out.println("Please two numbers between 1-54 you want to exclude");
        arr[0]=input.nextInt();
        arr[1]=input.nextInt();
        int output= getRandom(arr[0], arr[1]);
        System.out.println("Randomly generated number is: "+ output);
    }

    public static int getRandom(int... numbers){
        int random=0;

        do{
            random= (int)(Math.random()*54+1);
            return random;
        }
        while(!contains(numbers, random));
    }

    public static boolean contains(int[] numbers, int random){
        for(int num: numbers){
            if(num== random)
                return true;
        }
        return false;
    }
}
