package liang.hw.chapter05;

public class Q07 {
    /*(Financial application: compute future tuition) Suppose that the tuition for a university
     is $10,000 this year and increases 5% every year. In one year, the tuition
will be $10,500. Write a program that computes the tuition in ten years and the
total cost of four years’ worth of tuition after the tenth year

     */
    public static void main(String[] args) {
        double tuition = 10000;
        double totalCostOfEducation = 0;
        int year = 0;

        System.out.println("Tuition is $10.000 this year");
        for (int i = 0; i < 10; i++) {
            tuition = (tuition * 1.05);
        }
        System.out.printf("in 10 years tuition will be $%.2f", tuition);
        for (int j = 1; j <= 4; j++) {
            totalCostOfEducation += tuition;
            tuition = (tuition * 1.05);
        }
        System.out.println();
        System.out.printf("Total cost of 4 year education after the 10th year will be $%.2f" , totalCostOfEducation);
    }
}
