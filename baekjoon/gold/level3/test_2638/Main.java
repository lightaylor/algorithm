package baekjoon.gold.level3.test_2638;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final int[] x = {0, 0, 1, -1};
    private static final int[] y = {1, -1, 0, 0};
    private static int n;
    private static int m;
    private static int cheeseCount;
    private static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) cheeseCount++;
            }
        }

        System.out.print(getMeltedSeconds());
    }

    private static int getMeltedSeconds() {
        int seconds = 0;

        while (cheeseCount > 0) {
            List<int[]> melts = markOutsideAirAndCollect();
            for (int[] p : melts) {
                int i = p[0], j = p[1];
                if (map[i][j] >= 3) {
                    map[i][j] = -1;
                    cheeseCount--;
                } else {
                    map[i][j] = 1;
                }
            }
            seconds++;
        }
        return seconds;
    }

    private static List<int[]> markOutsideAirAndCollect() {
        Deque<int[]> q = new ArrayDeque<>();
        boolean[][] vis = new boolean[n][m];
        List<int[]> touched = new ArrayList<>();

        for (int j = 0; j < m; j++) {
            if (map[0][j] == 0) map[0][j] = -1;
            if (map[0][j] == -1 && !vis[0][j]) {
                vis[0][j] = true;
                q.add(new int[]{0, j});
            }

            if (map[n - 1][j] == 0) map[n - 1][j] = -1;
            if (map[n - 1][j] == -1 && !vis[n - 1][j]) {
                vis[n - 1][j] = true;
                q.add(new int[]{n - 1, j});
            }
        }
        for (int i = 0; i < n; i++) {
            if (map[i][0] == 0) map[i][0] = -1;
            if (map[i][0] == -1 && !vis[i][0]) {
                vis[i][0] = true;
                q.add(new int[]{i, 0});
            }

            if (map[i][m - 1] == 0) map[i][m - 1] = -1;
            if (map[i][m - 1] == -1 && !vis[i][m - 1]) {
                vis[i][m - 1] = true;
                q.add(new int[]{i, m - 1});
            }
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int dx = cur[0];
            int dy = cur[1];

            for (int k = 0; k < 4; k++) {
                int cx = dx + x[k];
                int cy = dy + y[k];
                if (cx < 0 || cy < 0 || cx >= n || cy >= m) continue;

                if (map[cx][cy] == 0 && !vis[cx][cy]) {
                    map[cx][cy] = -1;
                    vis[cx][cy] = true;
                    q.add(new int[]{cx, cy});
                } else if (map[cx][cy] >= 1) {
                    if (map[cx][cy] == 1) {
                        map[cx][cy] = 2;
                        touched.add(new int[]{cx, cy});
                    } else if (map[cx][cy] == 2) {
                        map[cx][cy] = 3;
                    }
                } else if (map[cx][cy] == -1 && !vis[cx][cy]) {
                    vis[cx][cy] = true;
                    q.add(new int[]{cx, cy});
                }
            }
        }
        return touched;
    }
}
