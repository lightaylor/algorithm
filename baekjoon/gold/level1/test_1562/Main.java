package gold.level1.test_1562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][][] dp = new int[n + 1][10][1024];
        for (int i = 1; i < 10; i++) dp[1][i][1 << i] = 1;

        int MOD = 1_000_000_000;
        for (int len = 1; len < n; len++) {
            for (int digit = 0; digit < 10; digit++) {
                for (int mask = 0; mask < 1024; mask++) {
                    int val = dp[len][digit][mask];
                    if (val == 0) continue;

                    if (digit > 0) {
                        int nextDigit = digit - 1;
                        int nextMask = mask | (1 << nextDigit);
                        dp[len + 1][nextDigit][nextMask] = (dp[len + 1][nextDigit][nextMask] + val) % MOD;

                    }

                    if (digit < 9) {
                        int nextDigit = digit + 1;
                        int nextMask = mask | (1 << nextDigit);
                        dp[len + 1][nextDigit][nextMask] = (dp[len + 1][nextDigit][nextMask] + val) % MOD;
                    }
                }
            }
        }

        long result = 0;
        for (int i = 0; i < 10; i++) {
            result += dp[n][i][1023];
        }
        System.out.print(result % MOD);
    }
}
