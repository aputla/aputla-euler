package euler.challenges.euler002;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int t = scanner.nextInt(); t > 0; t--) {
                long n = scanner.nextLong();
                long a = 1;
                long b = 2;
                long sum = 0;
                while (b <= n) {
                    if (b % 2 == 0) {
                        sum += b;
                    }
                    long temp = a + b;
                    a = b;
                    b = temp;
                }
                System.out.println(sum);
            }
        }
    }
}