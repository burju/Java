package liang.hw.chapter05;

import java.util.Scanner;

public class Q09 {
    /*(Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = 0;
        String studentName = "";
        int studentScore = 0;
        int highestScore = 0;
        int secondHighestScore = 0;
        String nameWithHighestScore = "";
        String nameWithSecondHighestScore = "";

        System.out.println("Please enter the number of students: ");
        numberOfStudents = input.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Please enter the name of the student");
            studentName = input.next();
            System.out.println("Please enter the score of the student");
            studentScore = input.nextInt();
            if (highestScore < studentScore) {
                int tempscore = highestScore;
                String tempName = studentName;
                highestScore = studentScore;
                nameWithHighestScore = studentName;

                if (secondHighestScore < tempscore) {
                    secondHighestScore = tempscore;
                    nameWithSecondHighestScore = tempName;

                }
            }
        }
        System.out.println("The name of the student with the highest score is: " + nameWithHighestScore + " and the score is: " + highestScore);
        System.out.println("The name of the student with the second highest score is: " + nameWithSecondHighestScore + " and the score is: " + secondHighestScore);

    }
}
