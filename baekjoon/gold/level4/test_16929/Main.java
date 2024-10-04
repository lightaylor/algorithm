package gold.level4.test_16929;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};
    private static boolean[][] check;
    private static char[][] arr;
    private static int n;
    private static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];
        check = new boolean[n][m];
        String answer = "No";

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (check[i][j]) continue;
                if (DFS(i, j,-1, -1, arr[i][j])) {
                    answer = "Yes";
                    break;
                }
            }
        }

        bw.write(answer);
        bw.close();
    }

    private static boolean DFS(int x, int y, int px, int py, char color) {
        if (check[x][y]) return true;
        check[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                if (!(nx == px && ny == py) && arr[nx][ny] == color) {
                    if (DFS(nx, ny, x, y, color)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
