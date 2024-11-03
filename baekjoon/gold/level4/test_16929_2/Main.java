package gold.level4.test_16929_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;
    private static char[][] BOARD;
    private static boolean[][] VISITED;
    private static final int[] DX = {0, 0, 1, -1};
    private static final int[] DY = {1, -1, 0, 0};
    private static boolean RESULT;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        BOARD = new char[N][M];
        VISITED = new boolean[N][M];
        RESULT = false;

        for (int i = 0; i < N; i++) {
            BOARD[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!VISITED[i][j]) {
                    dfs(i, j, -1, -1);
                }

                if (RESULT) break;
            }
        }

        System.out.print(RESULT ? "Yes" : "No");
    }

    private static void dfs(int x, int y, int prevX, int prevY) {
        VISITED[x][y] = true;

        for (int i = 0; i < DX.length; i++) {
            int nx = x + DX[i];
            int ny = y + DY[i];

            if (0 <= nx && nx < N && 0 <= ny && ny < M && !(prevX == nx && prevY == ny)) {
                if (BOARD[x][y] == BOARD[nx][ny]) {
                    if (VISITED[nx][ny]) {
                        RESULT = true;
                        return;
                    }
                    dfs(nx, ny, x, y);
                }
            }
        }
    }
}
