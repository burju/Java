package liang.hw.chapter05;

import java.util.Scanner;

public class Q02 {
    /* (Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five random
subtraction questions. Revise the program to generate ten random addition questions
for two integers between 1 and 15. Display the correct count and test time
     */
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            //generate 2 random integers to add
            int num1 = (int) ((Math.random() * 15) + 1);
            int num2 = (int) ((Math.random() * 15) + 1);

            //Display the math question to student
            System.out.println(
                    "What is " + num1 + " + " + num2 + " ?"
            );
            int answer = input.nextInt();

            //Grade the answer
            if (num1 + num2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong. \n" + num1 + " + " + num2 + " should be " + (num1 + num2));
            }
            count++;

            output += "\n" + num1 + " + " + num2 + " = " + answer + ((num1 + num2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime= endTime-startTime;

        System.out.println("\nCorrect count is: "+ correctCount+ "\nTest time is "+ testTime/1000+" seconds."+ output);
    }
}
