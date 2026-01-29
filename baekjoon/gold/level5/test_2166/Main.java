package baekjoon.gold.level5.test_2166;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[][] arr = new long[n + 1][2];
        long result = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        }

        arr[n][0] = arr[0][0];
        arr[n][1] = arr[0][1];

        for (int i = 0; i < n; ++i) {
            result += arr[i][0] * arr[i + 1][1] - arr[i][1] * arr[i + 1][0];
        }

        bw.write(String.format("%.1f", (Math.abs(result) / 2.0)));
        bw.close();
    }
}
