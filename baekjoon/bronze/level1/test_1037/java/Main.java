package bronze.level1.test_1037.java;

import java.io.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = 1_000_000;
        int max = 2;

        for (int i : arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        bw.write(String.valueOf(min * max));
        bw.close();
    }

}
