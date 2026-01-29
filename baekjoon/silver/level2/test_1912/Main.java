package baekjoon.silver.level2.test_1912;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] temp = new int[n];
        int max = -1000;

        temp[0] = arr[0];
        for (int i = 0; i < n; i++) {
            int m = i > 0 ? temp[i - 1] : 0;
            temp[i] = Math.max(m + arr[i], arr[i]);
            max = Math.max(max, temp[i]);
        }

        bw.write(String.valueOf(max));
        bw.close();
    }
}
