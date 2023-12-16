package liang.hw.chapter05;

public class Q13 {
     /*(Find the largest n such that n3 > 12,000) Use a while loop to find the largest
integer n such that n3 is less than 12,000
*/

    public static void main(String[] args) {
        int n = 0;
        boolean isSmall = true;
        while (isSmall) {
            n++;
            if (n * n * n > 12000){
                isSmall = false;
            }}
        System.out.println("Smallest number that gives n^3 >12000 is " + n);
    }
}
