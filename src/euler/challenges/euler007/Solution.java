package euler.challenges.euler007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    private static List<Integer> sieve(int n) {
        boolean[] P = new boolean[n + 1];
        Arrays.fill(P, true);
        P[0] = false;
        P[1] = false;
        int m = (int) Math.sqrt(n);

        for (int i = 2; i <= m; i++) {
            for (int j = 2 * i; P[i] && j <= n; j += i) {
                P[j] = false;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < P.length; i++) {
            if (P[i]) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = sieve(200000);
        try (Scanner scanner = new Scanner(System.in)) {
            for (int t = scanner.nextInt(); t > 0; t--) {
                int n = scanner.nextInt();
                System.out.println(list.get(n - 1));
            }
        }
    }
}