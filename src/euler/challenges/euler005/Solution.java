package euler.challenges.euler005;

import java.util.Scanner;

public class Solution {
    
    private static long gcd(long a, long b) {
        while (b != 0) {
            long c = b;
            b = a % b;
            a = c;
        }
        return a;
    }
    
    private static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    
    private static long findLCM(long n) {
        long result = 1;
        for (long i = 2; i <= n; i++) {
            result = lcm(result, i);
        }
        return result;
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int t = scanner.nextInt(); t > 0; t--) {
                long n = scanner.nextLong();
                System.out.println(findLCM(n));
            }
        }
    }
}