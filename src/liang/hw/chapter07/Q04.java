package liang.hw.chapter07;

import java.util.Scanner;

public class Q04 {
    /*
    (Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume that the maximum number of scores is 100.
     */
    public static void main(String[] args) {
        //create an array to store scores
        int[] scoresArray = new int[100];
        int sum = 0;
        int count = 0;
        int userInput;
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter each score you want to calculate");
        // store scores


        do {
            userInput=input.nextInt();
            if(userInput>=0){
               scoresArray[count]=userInput;
               sum+=scoresArray[count];
               count++;
            }
            }
        while(userInput>=0 );

        //get average
        int average = sum / (count);
        // print how many scores are
        int belowAvgCount = 0;
        int aboveAvgCount = 0;
        for (int i = 0; i < count; i++) {
            if (scoresArray[i] > average)
                aboveAvgCount++;
            else if(scoresArray[i] < average)
                belowAvgCount++;
        }
        System.out.println("The average of numbers entered is: "+ average);
        System.out.println(" the number of elements that are above average is: " + aboveAvgCount);
        System.out.println(" the number of elements that are below average is: " + belowAvgCount);

    }
}
