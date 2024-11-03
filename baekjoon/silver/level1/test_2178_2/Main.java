package silver.level1.test_2178_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;
    private static int[][] MIRO;
    private static boolean[][] VISITED;
    private static int[] DX = {1, 0, 0, -1};
    private static int[] DY = {0, 1, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        MIRO = new int[N][M];
        VISITED = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                MIRO[i][j] = arr[j] - '0';
            }
        }

        System.out.print(bfs(0, 0));
    }

    private static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y, 1});
        VISITED[x][y] = true;

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int count = arr[2];

            if (arr[0] == N - 1 && arr[1] == M - 1) {
                return count;
            }

            for (int i = 0; i < 4; i++) {
                int nx = arr[0] + DX[i];
                int ny = arr[1] + DY[i];

                if (0 <= nx && nx < N && 0 <= ny && ny < M) {
                    if (MIRO[nx][ny] == 1 && !VISITED[nx][ny]) {
                        queue.add(new int[]{nx, ny, count + 1});
                        VISITED[nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    }
}
