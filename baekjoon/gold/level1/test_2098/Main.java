package baekjoon.gold.level1.test_2098;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] cities = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cities[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[1 << n][n];
        for (int[] row : dp) Arrays.fill(row, Integer.MAX_VALUE);
        dp[1][0] = 0;

        for (int mask = 1; mask < (1 << n); mask++) {
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) == 0 || dp[mask][i] == Integer.MAX_VALUE)
                    continue;

                for (int next = 0; next < n; next++) {
                    if ((mask & (1 << next)) != 0 || cities[i][next] == 0)
                        continue;

                    int nextMask = mask | (1 << next);
                    dp[nextMask][next] = Math.min(dp[nextMask][next], dp[mask][i] + cities[i][next]);
                }
            }
        }

        int FULL = (1 << n) - 1;
        int answer = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (cities[i][0] == 0 || dp[FULL][i] == Integer.MAX_VALUE) continue;
            answer = Math.min(answer, dp[FULL][i] + cities[i][0]);
        }

        System.out.print(answer);
    }
}
