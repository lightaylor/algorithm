package baekjoon.gold.level3.test_14391.v1;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int m = arr[1];
        int answer = 0;
        int[][] num = new int[n][];

        for (int i = 0; i < n; i++) {
            num[i] = br.readLine().chars().map(Character::getNumericValue).toArray();
        }

        // 0: 가로, 1: 세로
        for (int i = 0; i < (1<<(n*m)); i++) {
            int sum = 0;
            for (int h = 0; h < n; h++) {
                int cursor = 0;
                for (int w = 0; w < m; w++) {
                    int idx = h * m + w;
                    if ((i&(1<<idx)) == 0) {
                        cursor = cursor * 10 + num[h][w];
                    } else {
                        sum += cursor;
                        cursor = 0;
                    }
                }
                sum += cursor;
            }

            for (int w = 0; w < m; w++) {
                int cursor = 0;
                for (int h = 0; h < n; h++) {
                    int idx = h * m + w;
                    if ((i&(1<<idx)) != 0) {
                        cursor = cursor * 10 + num[h][w];
                    } else {
                        sum += cursor;
                        cursor = 0;
                    }
                }
                sum += cursor;
            }
            answer = Math.max(answer, sum);
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
}
