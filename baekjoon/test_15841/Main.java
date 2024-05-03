package baekjoon.test_15841;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] dp = {0, 0, 1};
        String input = br.readLine();

        for(int i = 1; i <= 490; i++) {
            if(input.equals("-1")) break;
            else if(input.equals(String.valueOf(i))) {
                bw.write("Hour " + i + ": " + dp[2] + " cow(s) affected\n");
                input = br.readLine();
            }
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = dp[0] + dp[1];
        }
        bw.flush();
    }
}
