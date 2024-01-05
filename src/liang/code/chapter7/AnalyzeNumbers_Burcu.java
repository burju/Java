package liang.code.chapter7;

public class AnalyzeNumbers_Burcu {
    // Write a program taht finds the number of items above the average of all item.
    //read some numbers get the average and find the nums that are above average.
    public static void main(String[] args){
    java.util.Scanner input= new java.util.Scanner(System.in);
    System.out.println("Enter the number of items: ");
    int n=input.nextInt();
    double[] numbersArray= new double[n];
    double sum=0;

    System.out.println("Enter the numbers: ");
    for(int i=0; i<n; i++){
        numbersArray[i]= input.nextDouble();
        sum+=numbersArray[i];
    }

    double average= sum/n;
    // go over the array elements one by one and count the number of items above average and display
    int count=0;

    for(int i=0; i<n; i++){
     if(numbersArray[i]>average){
         count++;
     }
        }
        System.out.println("the average is: "+ average);
        System.out.println("the number of array elements above average is: "+ count);


    }
}
