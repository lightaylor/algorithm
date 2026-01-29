package baekjoon.silver.level1.test_2178.v1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static final int[] xd = {-1, 1, 0, 0};
    private static final int[] yd = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        boolean[][] check = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            char[] c = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                arr[i][j] = c[j] - '0';
            }
        }

        int[][] dist = new int[n][m];
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0));
        check[0][0] = true;
        dist[0][0] = 1;

        while (!queue.isEmpty()) {
            Pair pair = queue.remove();
            for (int i = 0; i < xd.length; i++) {
                int x = xd[i] + pair.x;
                int y = yd[i] + pair.y;
                if (0 <= x && x < n && 0 <= y && y < m) {
                    if (!check[x][y] && arr[x][y] == 1) {
                        queue.add(new Pair(x, y));
                        dist[x][y] = dist[pair.x][pair.y] + 1;
                        check[x][y] = true;
                    }
                }
            }
        }
        System.out.print(dist[n - 1][m - 1]);
    }
}

class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
