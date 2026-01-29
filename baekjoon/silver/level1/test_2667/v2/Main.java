package baekjoon.silver.level1.test_2667.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static int[][] MAP;
    private static boolean[][] VISITED;
    private static int[] DX = {0, 1, -1, 0};
    private static int[] DY = {1, 0, 0, -1};
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        VISITED = new boolean[N][N];
        MAP = new int[N][N];
        for (int i = 0; i < N; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                MAP[i][j] = arr[j] - '0';
            }
        }

        List<Integer> aptSize = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (MAP[i][j] == 1 && !VISITED[i][j]) {
                    int size = dfs(i, j);
                    aptSize.add(size);
                }
            }
        }

        System.out.println(aptSize.size());
        Collections.sort(aptSize);
        for (int i : aptSize) {
            System.out.println(i);
        }
    }

    private static int dfs(int x, int y) {
        VISITED[x][y] = true;
        int count = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + DX[i];
            int ny = y + DY[i];

            if (0 <= nx && nx < N && 0 <= ny && ny < N) {
                if (MAP[nx][ny] == 1 && !VISITED[nx][ny]) {
                    count += (dfs(nx, ny));
                }
            }
        }
        return count;
    }
}
