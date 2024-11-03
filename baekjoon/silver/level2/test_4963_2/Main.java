package silver.level2.test_4963_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static boolean[][] VISITED;
    private static int N;
    private static int M;
    private static int[][] MAP;
    private static int[] DX = {0, 0, 1, 1, 1, -1, -1, -1};
    private static int[] DY = {-1, 1, -1, 0, 1, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input.equals("0 0")) break;

            String[] arr = input.split(" ");
            N = Integer.parseInt(arr[0]);
            M = Integer.parseInt(arr[1]);
            MAP = new int[M][N];
            VISITED = new boolean[M][N];

            for (int i = 0; i < M; i++) {
                String[] line = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    MAP[i][j] = Integer.parseInt(line[j]);
                }
            }

            int count = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (MAP[i][j] == 1 && !VISITED[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void dfs(int x, int y) {
        VISITED[x][y] = true;

        for (int i = 0; i < DX.length; i++) {
            int nx = x + DX[i];
            int ny = y + DY[i];

            if (0 <= nx && nx < M && 0 <= ny && ny < N) {
                if (MAP[nx][ny] == 1 && !VISITED[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
