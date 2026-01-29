package baekjoon.gold.level1.test_1509;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();

        int n = str.length;
        boolean[][] palindrome = new boolean[n][n];
        for (int i = 0; i < n; i++) palindrome[i][i] = true;
        for (int i = 0; i < n - 1; i++)
            palindrome[i][i + 1] = (str[i] == str[i + 1]);

        for (int len = 3; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                int end = start + len - 1;
                palindrome[start][end] = (str[start] == str[end]) && palindrome[start + 1][end - 1];
            }
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (palindrome[j][i - 1]) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }

        System.out.print(dp[n]);
    }
}
