package baekjoon.gold.level5.test_7576.v3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static boolean[][] visited;
    private static int[][] boxes;
    private static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        visited = new boolean[N][M];
        boxes = new int[N][M];

        Queue<Point> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int tomato = sc.nextInt();
                boxes[i][j] = tomato;

                if (tomato == 1) {
                    visited[i][j] = true;
                    queue.add(new Point(i, j, 0));
                }
            }
        }

        answer = 0;
        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0};
        while (!queue.isEmpty()) {
            Point p = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = dx[i] + p.x;
                int y = dy[i] + p.y;

                if (0 <= x && x < N && 0 <= y && y < M) {
                    if (!visited[x][y] && boxes[x][y] == 0) {
                        visited[x][y] = true;
                        boxes[x][y] = 1;
                        queue.add(new Point(x, y, p.count + 1));
                    }
                }
            }
            answer = Math.max(answer, p.count);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (boxes[i][j] == 0) {
                    answer = -1;
                    break;
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
