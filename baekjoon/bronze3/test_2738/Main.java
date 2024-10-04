package bronze3.test_2738;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] arr = new int[n[0] * 2][n[1]];

        for (int i = 0; i < n[0] * 2; i++) {
            arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for(int i = 0; i < arr.length / 2; i++) {
            for(int j = 0; j < n[1]; j++) {
                bw.write(arr[i][j] + arr[arr.length / 2 + i][j] + " ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
