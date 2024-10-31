package silver.level2.test_16931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] blocks = new int[N][M];

        for (int i = 0; i < N; i++) {
            blocks[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int front = 0;
        for (int i = 0; i < N; i++) {
            front += blocks[i][0] + blocks[i][M - 1];
            for (int j = 1; j < M; j++) {
                front += Math.abs(blocks[i][j] - blocks[i][j - 1]);
            }
        }

        int side = 0;
        for (int i = 0; i < M; i++) {
            side += blocks[0][i] + blocks[N - 1][i];
            for (int j = 1; j < N; j++) {
                side += Math.abs(blocks[j][i] - blocks[j - 1][i]);
            }
        }

        int sum = (N * M * 2) + front + side;
        System.out.print(sum);
    }
}
