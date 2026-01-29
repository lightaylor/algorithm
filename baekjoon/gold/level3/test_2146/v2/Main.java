package baekjoon.gold.level3.test_2146.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Main {
    private static boolean[][] visited;
    private static int n;
    private static int[][] island;
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n][n];
        island = new int[n][n];

        for (int i = 0; i < n; i++) {
            island[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int islandId = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (island[i][j] == 1 && !visited[i][j]) {
                    markIsland(i, j, islandId);
                    islandId++;
                }
            }
        }

        int shortestBridge = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (island[i][j] > 1) {
                    visited = new boolean[n][n];
                    shortestBridge = Math.min(shortestBridge, bfs(i, j, island[i][j]));
                }
            }
        }

        System.out.print(shortestBridge);
    }

    private static void markIsland(int x, int y, int islandId) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y, 0));
        visited[x][y] = true;
        island[x][y] = islandId;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny] && island[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    island[nx][ny] = islandId;
                    queue.add(new Point(nx, ny, 0));
                }
            }
        }
    }

    private static int bfs(int startX, int startY, int islandId) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startX, startY, 0));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
                    visited[nx][ny] = true;

                    if (island[nx][ny] == 0) {
                        queue.add(new Point(nx, ny, point.idx + 1));
                    } else if (island[nx][ny] != islandId) {
                        return point.idx;
                    }
                }
            }
        }

        return Integer.MAX_VALUE;
    }
}

class Point {
    int x, y, idx;

    public Point(int x, int y, int idx) {
        this.x = x;
        this.y = y;
        this.idx = idx;
    }
}
