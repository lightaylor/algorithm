package baekjoon.bronze.level4.test_10156;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = arr[0] * arr[1] - arr[2];
        if (answer < 0) {
            answer = 0;
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
