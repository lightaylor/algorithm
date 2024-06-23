package bronze2.test_15841;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        BigInteger[] dp = {new BigInteger("0"), new BigInteger("0"), new BigInteger("1")};
        List<BigInteger> list = new ArrayList<>();
        list.add(new BigInteger("1"));

        for(int i = 1; i <= 490; i++) {
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = dp[0].add(dp[1]);
            list.add(dp[2]);
        }

        while(input > -1) {
            bw.write("Hour " + input + ": " + list.get(input - 1) + " cow(s) affected\n");
            input = Integer.parseInt(br.readLine());
        }

        bw.close();
    }
}
