package liang.hw.chapter05;

public class Q05 {
    /*5 (Conversion from kilograms to pounds and pounds to kilograms) Write a program
that displays the following two tables side by side:
Kilograms Pounds | Pounds Kilograms
    1       2.2  | 20 9.09
    3       6.6  | 25 11.36
...
    197     433.4| 510 231.82
    199     437.8| 515 234.09
    ---> HOW TO TRIM Trailing zeros?
      */
    public static void main(String[] args) {
        int kilograms = 1;
        double pounds = 20;

        //display table header
        System.out.println("Kilograms         Pounds      |     Pounds         Kilograms");
        //display body
        while (kilograms < 200) {
            System.out.printf("%4d                %.2f      |     ", kilograms, kilograms * 2.2);
            System.out.printf("%.2f               %4.2f%n", pounds, pounds / 2.2);
            System.out.println();
            kilograms += 2;
            pounds += 5;

        }


    }

}
