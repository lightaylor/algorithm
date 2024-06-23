package bronze2.test_26529;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input;
        int count = Integer.parseInt(br.readLine());
        Long[] dp = {0L, 0L, 1L};
        List<Long> list = new ArrayList<>();
        list.add(1L);

        for(int i = 0; i <= 45; i++) {
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = dp[0] + dp[1];
            list.add(dp[2]);
        }

        for(int j = 0; j < count; j++) {
            input = Integer.parseInt(br.readLine());
            bw.write(list.get(input) + "\n");
        }
        bw.close();
    }
}
