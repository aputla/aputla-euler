package euler.challenges.euler003;

import java.util.Scanner;

public class Solution {
    private static boolean isPrime(long n) {
        for (long i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    private static long largestPrimeFactor(long n) {
        long result = -1;
        long s = (long) Math.sqrt(n);
        for (long i = 2; i <= s; i++) {
            if (n % i == 0) {
                result = isPrime(i) && i > result ? i : result;
                result = isPrime(n / i) && n / i > result ? n / i : result;
            }
        }
        if (result == -1) {
            result = n;
        }
        return result;
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int t = scanner.nextInt(); t > 0; t--) {
                long n = scanner.nextLong();
                System.out.println(largestPrimeFactor(n));
            }
        }
    }
}