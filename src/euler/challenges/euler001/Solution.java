package euler.challenges.euler001;

import java.util.Scanner;

public class Solution {
    
    private static long sumn(long n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int t = scanner.nextInt(); t > 0; t--) {
                long n = scanner.nextLong();
                long result = 3 * sumn((n - 1) / 3) + 5 * sumn((n - 1) / 5) - 15 * sumn((n - 1) / 15);
                System.out.println(result);
            }
        }
    }
}