package baekjoon.silver.level1.test_1932;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n][n];
        dp[0][0] = Integer.parseInt(br.readLine());
        int answer = dp[0][0];

        for (int i = 1; i < n; i++) {
            int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = arr[j] + dp[i-1][j];
                } else if (i == j) {
                    dp[i][j] = arr[j] + dp[i-1][j-1];
                } else {
                    dp[i][j] = arr[j] + Math.max(dp[i-1][j-1], dp[i-1][j]);
                }
                answer = Math.max(dp[i][j], answer);
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
