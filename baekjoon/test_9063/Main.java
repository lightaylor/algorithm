package test_9063;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] x = {100000, -100000};
        int[] y = {100000, -100000};
        int[] arr;

        for (int i = 0; i < n; i++) {
            arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            x[0] = Math.min(arr[0], x[0]);
            x[1] = Math.max(arr[0], x[1]);

            y[0] = Math.min(arr[1], y[0]);
            y[1] = Math.max(arr[1], y[1]);
        }

        bw.write(String.valueOf(Math.abs((x[1] - x[0]) * (y[1] - y[0]))));
        bw.close();
    }
}
