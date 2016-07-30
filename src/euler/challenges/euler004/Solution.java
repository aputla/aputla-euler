package euler.challenges.euler004;

import java.util.Scanner;
import java.util.TreeSet;

public class Solution {
    private static boolean isPalindrome(int k) {
        String s = Integer.valueOf(k).toString();
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        TreeSet<Integer> list = new TreeSet<>();
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int p = i * j;
                if (isPalindrome(p)) {
                    list.add(p);
                }
            }
        }
        try (Scanner scanner = new Scanner(System.in)) {
            for (int t = scanner.nextInt(); t > 0; t--) {
                int n = scanner.nextInt();
                int ans = list.floor(n);
                ans = (ans == n) ? list.floor(n - 1) : ans;
                System.out.println(ans);
            }
        }
    }
}