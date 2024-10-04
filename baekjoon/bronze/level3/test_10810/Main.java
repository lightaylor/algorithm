package bronze.level3.test_10810;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int[] ball = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = ball[0] - 1; j < ball[1]; j++) {
                arr[j] = ball[2];
            }
        }

        for (int str: arr) {
            bw.write(str + " ");
        }
        bw.close();
    }
}
