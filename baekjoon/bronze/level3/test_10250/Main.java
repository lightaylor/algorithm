package baekjoon.bronze.level3.test_10250;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int h = arr[0];
            int w = arr[1];
            int n = arr[2];
            String answer = (n % h == 0 ? h : n % h)
                    + String.format("%02d", (n % h > 0 ? n / h + 1 : n / h));

            bw.write(answer);
            bw.newLine();
        }

        bw.close();
    }
}
