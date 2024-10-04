package silver5.test_2563;

import java.io.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] temp = new int[n][];
        int x = 0, y = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            temp[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            x = Math.max(x, temp[i][0]);
            y = Math.max(y, temp[i][1]);
        }

        int[][] arr = new int[x + 10][y + 10];

        for (int i = 0; i < n; i++) {
            x = temp[i][0] - 1;
            for (int j = x; j < x + 10; j++) {
                y = temp[i][1] - 1;
                for (int k = y; k < y + 10; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        for (int[] ar : arr) {
            for (int j : ar) {
                sum += j;
            }
        }

        bw.write(String.valueOf(sum));
        bw.close();
    }
}
