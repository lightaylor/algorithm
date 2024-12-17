package silver.level1.test_2178.v3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        char[][] map = new char[N][];
        for (int i = 0; i < N; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0, 1));
        boolean[][] visited = new boolean[N][M];
        visited[0][0] = true;

        int answer = Integer.MAX_VALUE;
        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0};
        while (!queue.isEmpty()) {
            Point current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = current.x + dx[i];
                int y = current.y + dy[i];
                int count = current.count;

                if (0 <= x && x < N && 0 <= y && y < M) {
                    if (x == N - 1 && y == M - 1) {
                        answer = Math.min(count + 1, answer);
                    }

                    if (!visited[x][y] && map[x][y] == '1') {
                        queue.add(new Point(x, y, count + 1));
                    }
                    visited[x][y] = true;
                }
            }
        }
        System.out.print(answer);
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
