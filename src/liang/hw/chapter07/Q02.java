package liang.hw.chapter07;

public class Q02 {
    /*
    (Reverse the numbers entered) Write a program that reads
    ten integers and displays them in the reverse of the order
    in which they were read.

     */
    public static void main(String[] args) {
        int ARR_LENGTH=10;
        int[] intArray= new int[ARR_LENGTH];
        int[] newIntArray= new int[ARR_LENGTH];

        java.util.Scanner input= new java.util.Scanner(System.in);
        System.out.println("Please enter 10 integers");
        for(int i=0; i<ARR_LENGTH; i++){
            intArray[i]=input.nextInt();
        }
        System.out.println("Your array revesed: ");
        //Reverse the array
        for(int i=ARR_LENGTH-1, j=0; i>=0 ; i--,j++){
            newIntArray[j]= intArray[i];
            System.out.print(" "+ newIntArray[j]);
        }
    }
}
