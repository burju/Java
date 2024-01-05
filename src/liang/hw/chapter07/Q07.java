package liang.hw.chapter07;

public class Q07 {
    /*
    (Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.
     */

    public static void main(String[] args) {

        //generate 100 integers between0-9 and store them in an array:

        int[] randomInts = new int[100];
        for (int i = 0; i < 100; i++) {
            randomInts[i] = (int) (Math.random() * 10);
        }
        printRandomInts(randomInts);

        //generate an arr of 0 an count each occurance of each number in randomIntArr
        int[] countArr = new int[10];
        for (int i = 0; i < randomInts.length; i++) {
            countArr[randomInts[i]]++;
        }
        printCounts(countArr);
    }


    //METHODS:

    public static void printRandomInts(int[] randomInts) {
        System.out.println("Randomly generated 100 integers betweer 0-9 are:");
        for (int i = 0; i < randomInts.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println(randomInts[i]);
            } else
                System.out.print(randomInts[i] + " ");
        }
        System.out.println();
    }

    public static void printCounts(int[] countArr) {
        for (int i = 0; i < countArr.length; i++)
            System.out.println(i + " is displayed " + countArr[i] + " times.");
    }

}
