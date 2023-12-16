package liang.hw.chapter05;

public class Q04 {
    /*(Conversion from miles to kilometers) Write a program that displays
    the following table (note that 1 mile is 1.609 kilometers)
     */

    public static void main(String[] args) {
        int miles=1;
        double kilometers=0;
        System.out.println("Miles            Kilometers\n");
        while(miles<11){
            kilometers=miles*1.609;
            System.out.printf(
                    "%4d",miles);
            System.out.print("              "+ kilometers );
            miles++;
            System.out.println();
        }


    }
}
