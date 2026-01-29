package baekjoon.bronze.level3.test_13063;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (input[0] > 0) {
            int a = input[1];
            int b = input[2];
            int c = input[0] - a - b;
            int answer = 0;

            if (a + c > b) {
                for (int i = 0; i <= c; i++) {
                    if (a + i > b + c - i) {
                        answer = i;
                        break;
                    }
                }
            } else {
                answer = -1;
            }

            bw.write(String.valueOf(answer));
            bw.newLine();
            input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        bw.close();
    }
}
