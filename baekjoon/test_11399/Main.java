package test_11399;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.valueOf(br.readLine());
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        Arrays.sort(arr);
        for (int i = 0; i < count; i++) {
            sum += arr[i] * (count - i);
        }

        bw.write(String.valueOf(sum));
        bw.close();
    }
}
