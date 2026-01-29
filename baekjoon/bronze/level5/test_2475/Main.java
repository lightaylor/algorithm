package baekjoon.bronze.level5.test_2475;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] arr = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long answer = 0;

        for (long l : arr) {
            answer += (long) Math.pow(l, 2);
        }

        bw.write(String.valueOf(answer % 10));
        bw.close();
    }
}
