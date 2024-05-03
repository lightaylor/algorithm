package baekjoon.test_19587;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] dp = {0, 1, 1};

        for(int i = 0; i < n; i++) {
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = ((dp[1] * 2) + dp[0]) % 1000000007;
        }
        bw.write(String.valueOf(dp[2]));
        bw.close();
    }
}
