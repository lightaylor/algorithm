package baekjoon.bronze.level3.test_1085;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = Math.min(Math.min(arr[0], arr[2] - arr[0]), Math.min(arr[1], arr[3] - arr[1]));

        bw.write(String.valueOf(min));
        bw.close();
    }
}
