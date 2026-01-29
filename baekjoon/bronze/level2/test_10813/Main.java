package baekjoon.bronze.level2.test_10813;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] arr = new int[n];
        int temp = 0;

        for(int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        for (int i = 0; i < m; i++) {
            int[] ball = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            temp = arr[ball[0] - 1];
            arr[ball[0] - 1] = arr[ball[1] - 1];
            arr[ball[1] - 1] = temp;
        }

        for (int str: arr) {
            bw.write(str + " ");
        }
        bw.close();
    }
}
