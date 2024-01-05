package liang.hw.chapter07;

import java.util.Scanner;

public class Q03 {
    /*
    (Count occurrence of numbers) Write a program that reads the integers between 1
and 100 and counts the occurrences of each. Assume the input ends with 0. Here
is a sample run of the program:
Programming Exercises 277
Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
Note that if a number occurs more than one time, the plural word “times” is used
in the output
     */
    public static void main(String[] args) {
        //create arr for all nums between 0-100
        int[] arr = new int[101];
        java.util.Scanner input = new Scanner(System.in);
        int userInput;
        int occurrance=0;

        System.out.println("Enter the integers between 1 and 100");
        //store user inputs in the array
            do {
                userInput = input.nextInt();
                for(int i=0; i<101; i++){
                    if( i == userInput){
                        arr[userInput]++;
                    }
                }
            }
            while (userInput != 0 && userInput > 0 && userInput < 101);

            for(int i=1; i<arr.length; i++){
                if(arr[i]>0)
                System.out.println(i+" occurs " +arr[i] + (arr[i]>1? " times " : " time "));
            }

        }

}
