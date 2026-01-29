package baekjoon.silver.level1.test_1149;

import java.io.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] cost = new int[n][3];

        for (int i = 0; i < n; i++) {
            cost[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (i > 0) {
                cost[i][0] = Math.min(cost[i-1][1], cost[i-1][2]) + cost[i][0];
                cost[i][1] = Math.min(cost[i-1][0], cost[i-1][2]) + cost[i][1];
                cost[i][2] = Math.min(cost[i-1][0], cost[i-1][1]) + cost[i][2];
            }
        }

        bw.write(String.valueOf(Math.min(cost[n-1][0], Math.min(cost[n-1][1], cost[n-1][2]))));
        bw.close();
    }
}
