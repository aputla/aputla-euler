package euler.challenges.euler008;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int t = scanner.nextInt(); t > 0; t--) {
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                String word = scanner.next();
                int result = 0;
                for (int i = 0; i < word.length() - k; i++) {
                    int product = 1;
                    for (int j = 0; j < k; j++) {
                        product *= word.charAt(i + j) - '0';
                    }
                    result = Math.max(result, product);
                }
                System.out.println(result);
            }
        }
    }
}