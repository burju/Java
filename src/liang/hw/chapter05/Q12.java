package liang.hw.chapter05;

public class Q12 {
    /*(Find the smallest n such that n2 > 12,000) Use a while loop to find the smallest
integer n such that n2 is greater than 12,000
*/

    public static void main(String[] args) {
        int n = 0;
        boolean isSmall = true;
        while (isSmall) {
            n++;
            if (n * n > 12000){
                isSmall = false;
        }}
        System.out.println("Smallest number that gives n^2 >12000 is " + n);
    }
}


