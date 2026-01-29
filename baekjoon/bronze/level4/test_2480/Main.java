package baekjoon.bronze.level4.test_2480;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dist = Arrays.stream(arr).distinct().toArray();
        int price = 0;

        switch (dist.length) {
            case 1:
                price = 10000 + 1000 * dist[0];
                break;
            case 2:
                dist[0] = arr[0] == arr[1] ? arr[0] : arr[2];
                price = 1000 + 100 * dist[0];
                break;
            case 3:
                Arrays.sort(dist);
                price = 100 * dist[2];
        }

        bw.write(String.valueOf(price));
        bw.close();
    }
}
