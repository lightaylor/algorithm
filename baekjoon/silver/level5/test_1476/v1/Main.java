package baekjoon.silver.level5.test_1476.v1;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int e = 1;
        int s = 1;
        int m = 1;
        int count = 1;

        while (true) {
            if (input[0] == e && input[1] == s && input[2] == m) {
                bw.write(String.valueOf(count));
                bw.close();
                break;
            }

            e = e < 15 ? e + 1 : 1;
            s = s < 28 ? s + 1 : 1;
            m = m < 19 ? m + 1 : 1;
            count++;
        }
    }
}
