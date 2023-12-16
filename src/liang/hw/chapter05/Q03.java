package liang.hw.chapter05;
/*(Conversion from kilograms to pounds) Write a program that displays
the following table (note that 1 kilogram is 2.2 pounds)
Kilograms Pounds
1          2.2
3          6.6
...
197        433.4
199        437.
* */
public class Q03 {
    public static void main(String[] args) {
        int kg=1;
        System.out.println("Kilograms            Pounds\n");
        while(kg<200){

            System.out.println(
                   "    "+ kg+"           "+(kg*2.2));
            kg+=2;
        }


    }
}
