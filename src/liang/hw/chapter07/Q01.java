package liang.hw.chapter07;

public class Q01 {
    /*
    Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is Ú best - 10
Grade is B if score is Ú best - 20;
Grade is C if score is Ú best - 30;
Grade is D if score is Ú best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades. Here
is a sample run
     */

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter the number of students");
        int numOfStudents = input.nextInt();
        //create Score array
        int[] scores = new int[numOfStudents];
        int bestScore = scores[0];
        //prompt user to enter each score and calculate the best score spontaneously:
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Please enter the score of student number " + (i+1));
            scores[i] = input.nextInt();
            if (bestScore < scores[i]) {
                bestScore = scores[i];
            }
        }


        //use switch statement to display each score based on the best Score
        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= bestScore - 10)
                System.out.println("Student " + (i+1) + " score is " + scores[i] + " and grade is A");
            else if (scores[i] >= bestScore - 20)
                System.out.println("Student " + (i+1) + " score is " + scores[i] + " and grade is B");
            else if (scores[i] >= bestScore - 30)
                System.out.println("Student " + (i+1) + " score is " + scores[i] + " and grade is C");
            else if (scores[i] >= bestScore - 40)
                System.out.println("Student " + (i+1) + " score is " + scores[i] + " and grade is D");
            else
                System.out.println("Student " + (i+1) + " score is " + scores[i] + " and grade is F");
        }
    }
}

