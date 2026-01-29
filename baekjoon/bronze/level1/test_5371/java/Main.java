package baekjoon.bronze.level1.test_5371.java;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int answer = 0;
            int n = Integer.parseInt(br.readLine());
            int[][] mosquitoes = new int[n][2];
            for (int j = 0; j < n; j++) {
                mosquitoes[j] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }

            int m = Integer.parseInt(br.readLine());
            boolean[] check = new boolean[n];
            for (int j = 0; j < m; j++) {
                int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int k = 0;
                for (int[] mos : mosquitoes) {
                    if (arr[0] - 50 <= mos[0] && mos[0] <= arr[0] + 50
                        && arr[1] - 50 <= mos[1] && mos[1] <= arr[1] + 50 && !check[k]) {
                        answer += 1;
                        check[k] = true;
                    }
                    k += 1;
                }
            }
            bw.write(String.valueOf(answer));
            bw.newLine();
        }
        bw.close();
    }
}
