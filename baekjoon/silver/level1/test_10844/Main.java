package silver.level1.test_10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[][] dp = new long[N + 1][10];
        int MOD = 1_000_000_000;

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int n = 2; n <= N; n++) {
            for (int i = 0; i <= 9; i++) {
                if (i > 0) {
                    dp[n][i] += dp[n - 1][i - 1];
                }
                if (i < 9) {
                    dp[n][i] += dp[n - 1][i + 1];
                }
                dp[n][i] = dp[n][i] % MOD;
            }
        }

        long result = 0;
        for (int d = 0; d <= 9; d++) {
            result += dp[N][d];
        }

        System.out.print(result % MOD);
    }
}
