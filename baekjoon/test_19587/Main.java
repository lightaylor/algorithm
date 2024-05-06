package baekjoon.test_19587;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long n = Long.parseLong(br.readLine());
        BigInteger[] dp = {new BigInteger("0"), new BigInteger("1"), new BigInteger("1")};

        for(int i = 0; i < n; i++) {
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = dp[1].multiply(new BigInteger("2")).add(dp[0]).remainder(new BigInteger("1000000007"));
        }

        bw.write(dp[2].toString());
        bw.close();
    }
}