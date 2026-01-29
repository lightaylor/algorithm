package baekjoon.silver.level1.test_2667.v3;

import java.util.*;

public class Main {

    private static boolean[][] visited;
    private static List<Integer> list;
    private static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        list = new ArrayList<>();
        visited = new boolean[N][N];
        arr = new char[N][];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && arr[i][j] == '1') {
                    bfs(new Point(i, j), N);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (int i : list) {
            System.out.println(i);
        }
    }

    private static void bfs(Point point, int N) {
        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0};

        Queue<Point> queue = new LinkedList<>();
        queue.add(point);
        visited[point.x][point.y] = true;

        int count = 1;
        while (!queue.isEmpty()) {
            Point p = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = dx[i] + p.x;
                int y = dy[i] + p.y;
                if (0 <= x && x < N && 0 <= y && y < N) {
                    if (!visited[x][y] && arr[x][y] == '1') {
                        visited[x][y] = true;
                        queue.add(new Point(x, y));
                        count++;
                    }
                }
            }
        }
        list.add(count);
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
