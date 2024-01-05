package liang.hw.chapter07;

public class Q06 {
    /*
    (Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number
     n is prime by checking whether 2, 3, 4, 5, 6, ..., n/2 is a divisor. If a divisor
is found, n is not prime. A more efficient approach is to check whether any of the
prime numbers less than or equal to 2n can divide n evenly. If not, n is prime.
Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
You need to use an array to store the prime numbers and later use them to check
whether they are possible divisors for n
     */
    public static void main(String[] args) {
        int[] primeArr = new int[50];
        int num = 2;
        int count = 0;

        while (count < primeArr.length) {
            if (isPrime(num)) {
                primeArr[count] = num;
                count++;
            }
            num++;
        }
        for (int i = 0; i < primeArr.length; i++) {
            System.out.print((i % 10 == 0 && i != 0) ? primeArr[i] + "\n" : primeArr[i] + " ");

        }
    }

    public static boolean isPrime(int num) {
        for (int divisor = 2; divisor <= num / 2; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
