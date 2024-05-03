package baekjoon.test_15841;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger[] dp = {new BigInteger("0"), new BigInteger("0"), new BigInteger("1")};
        String input = br.readLine();

        for(int i = 1; i <= 490; i++) {
            if(input.equals("-1")) break;
            else if(input.equals(String.valueOf(i))) {
                bw.write("Hour " + i + ": " + dp[2] + " cow(s) affected\n");
                input = br.readLine();
            }
            System.out.println(dp[2]);
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = dp[0].add(dp[1]);
        }
        bw.close();
    }
}
