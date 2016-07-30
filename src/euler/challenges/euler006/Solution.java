package euler.challenges.euler006;

import java.util.Scanner;

public class Solution {
    private static long f(long n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    private static long g(long n) {
        long k = n * (n + 1) / 2;
        return k * k;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int t = scanner.nextInt(); t > 0; t--) {
                int n = scanner.nextInt();
                System.out.println(Math.abs(f(n) - g(n)));
            }
        }
    }
}