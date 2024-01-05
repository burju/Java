package liang.hw.chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
    /*
    (Statistics: compute deviation) Programming Exercise 5.45 computes the standard deviation of numbers. This exercise uses a different but equivalent formula to
    compute the standard deviation of n numbers.
    ...
    To compute the standard deviation with this formula, you have to store the individual numbers using an array, so that they can be used after the mean is obtained.
    Your program should contain the following methods:
    /** Compute the deviation of double values
    public static double deviation(double[] x)
    /** Compute the mean of an array of double values
    public static double mean(double[] x)
    Write a test program that prompts the user to enter ten numbers and displays the
    mean and standard deviation, as shown in the following sample run:

    Enter ten numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
    The mean is 3.11
    The standard deviation is 1.55738
     */
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        double[] doubleArr = new double[10];
        System.out.println("Please enter 10 numbers: ");
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = input.nextDouble();
        }
        double mean = mean(doubleArr);
        double deviation = deviation(doubleArr, mean);
        System.out.println(" The mean is: " + mean);
        System.out.println(" The standard deviation is: " + deviation);

    }

    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        return sum / x.length;
        /*
        ALternative calculation of this found on Google:
        double mean2= Arrays.stream(x).average().orElse(0);
           */
    }

    public static double deviation(double[] x, double mean) {

        //calculate the sum of squared differences from the mean:
        double sumSquared = 0;
        for (int i = 0; i < x.length; i++) {
            sumSquared += Math.pow((x[i] - mean), 2);
        }
        /*
        Alternative calculation of this found on Google:
        need to master the following later:
        double sumOfSquaredDifferences= Arrays.stream(x).map(num-> Math.pow(num-mean,2)).sum();
         */


        //calculate the variance:
        double variance = sumSquared / (x.length-1);

        return Math.sqrt(variance);

    }
}
