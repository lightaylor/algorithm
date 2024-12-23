package gold.level3.test_2146.v3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static boolean[][] visited;
    private static int N;
    private static int[][] map;
    private static int answer;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        visited = new boolean[N][N];
        int group = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    visited[i][j] = true;
                    map[i][j] = group;
                    bfs(new Point(i, j, group++));
                }
            }
        }

        answer = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] > 0) {
                    visited = new boolean[N][N];
                    visited[i][j] = true;
                    findMinValue(new Point(i, j, 0), map[i][j]);
                }
            }
        }
        System.out.print(answer);
    }

    private static void findMinValue(Point point, int group) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(point);

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int count = p.count;

            for (int i = 0; i < 4; i++) {
                int x = p.x + dx[i];
                int y = p.y + dy[i];

                if (0 <= x && x < N && 0 <= y && y < N && !visited[x][y]) {
                    if (map[x][y] == 0) {
                        queue.add(new Point(x, y, count + 1));
                    } else if (map[x][y] != group) {
                        answer = Math.min(answer, count);
                    }
                    visited[x][y] = true;
                }
            }
        }
    }

    private static void bfs(Point point) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(point);

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int group = p.count;

            for (int i = 0; i < 4; i++) {
                int x = p.x + dx[i];
                int y = p.y + dy[i];

                if (0 <= x && x < N && 0 <= y && y < N && !visited[x][y] && map[x][y] == 1) {
                    queue.add(new Point(x, y, group));
                    map[x][y] = group;
                    visited[x][y] = true;
                }
            }
        }
    }

    static class Point {
        int x;
        int y;
        int count;

        public Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
