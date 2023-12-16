package liang.hw.chapter05;

public class Q11 {
    /*(Find numbers divisible by 5 or 6, but not both) Write a program that displays
all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not
both. Numbers are separated by exactly one space*/
    public static void main(String[] args) {
        int linecount = 0;
        System.out.println("Here is the list of numbers between 100 to 200" +
                "that is divisible by 5 or 6 but not both");
        for (int i = 100; i <= 200; i++) {
            if ((i % 5 == 0 || i % 6 == 0) && i % 30 != 0) {
                System.out.print(" " + i + " ");
                linecount++;
                if (linecount != 0 && linecount % 10 == 0) {
                    System.out.println();
                }
            }

        }
    }
}
