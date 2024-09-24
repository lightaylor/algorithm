package bronze2.test_10864;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] n = new int[arr[0]];

        for (int i = 0; i < arr[1]; i++) {
            int[] num = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            n[num[0] - 1] += 1;
            n[num[1] - 1] += 1;
        }

        for (int i : n) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.close();
    }
}
