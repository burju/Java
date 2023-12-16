package liang.hw.chapter05;

import java.util.Scanner;

public class Q08 {
    /*(Find the highest score) Write a program that prompts the user to enter
    the number of students and each student’s name and score, and finally displays the name
of the student with the highest score.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = 0;
        String studentName = "";
        int studentScore = 0;
        int highestScore = 0;
        String nameWithHighestScore = "";

        System.out.println("Please enter the number of students: ");
        numberOfStudents = input.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Please enter the name of the student");
            studentName = input.next();
            System.out.println("Please enter the score of the student");
            studentScore = input.nextInt();
            if (highestScore < studentScore) {
                highestScore = studentScore;
                nameWithHighestScore = studentName;
            }
        }
        System.out.println("The name of the student with the highest score is: " + nameWithHighestScore + " and the score is: " + highestScore);
    }
}
