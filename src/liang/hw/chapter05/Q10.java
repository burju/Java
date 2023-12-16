package liang.hw.chapter05;

public class Q10 {
    /*(Find numbers divisible by 5 and 6) Write a program that displays
     all the numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6.
      Numbers are separated by exactly one space
     */

    public static void main(String[] args) {
        int linecount = 0;
        System.out.println("Here is the list of numbers between 100 to 1000 & divisible by both 5 and 6");
        for (int i = 100; i <= 1000; i++) {
            if (i % 30 == 0) {
                System.out.print(" " + i + " ");
                linecount++;
                if (linecount != 0 && linecount % 10 == 0) {
                    System.out.println();
                }
            }


        }
    }
}
