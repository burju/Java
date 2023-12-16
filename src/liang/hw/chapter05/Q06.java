package liang.hw.chapter05;

public class Q06 {
    /*(Conversion from miles to kilometers) Write a program that
    displays the following two tables side by side:
     Miles Kilometers | Kilometers   Miles
      1       1.609   |   20         12.430

     */
    public static void main(String[] args) {
        int miles = 1;
        double kilometers = 20;

        //header:
        System.out.println("Miles         Kilometers      |     Kilometers         Miles");
        //body
        while (miles < 11) {
            System.out.printf("%4d               %.3f      |     ", miles, (miles * 1.609));
            System.out.printf("%1d               %.3f      |     ", (int) kilometers, (kilometers / 1.609));
            System.out.println();
            miles += 1;
            kilometers += 5;
        }
    }


}
