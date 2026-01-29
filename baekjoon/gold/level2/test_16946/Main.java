package baekjoon.gold.level2.test_16946;

import java.util.*;

public class Main {
    private static int n, m;
    private static int[][] map;
    private static int[][] groupId;
    private static int[] groupSize;
    private static boolean[][] visited;

    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static int currentGroup;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        map = new int[n][m];
        groupId = new int[n][m];
        visited = new boolean[n][m];
        groupSize = new int[n * m + 1];
        currentGroup = 1;

        for (int i = 0; i < n; i++) {
            char[] arr = sc.nextLine().toCharArray();
            for (int j = 0; j < m; j++) {
                map[i][j] = arr[j] - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    bfs(new Point(i, j));
                    currentGroup++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1) sb.append(getCount(i, j));
                else sb.append(0);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    private static int getCount(int i, int j) {
        int count = 1;

        Set<Integer> uniqueIndexes = new HashSet<>();
        for (int k = 0; k < 4; k++) {
            int cx = dx[k] + i;
            int cy = dy[k] + j;
            if (cx >= 0 && cy >= 0 && cx < n && cy < m && !uniqueIndexes.contains(groupId[cx][cy])) {
                count += groupSize[groupId[cx][cy]];
                uniqueIndexes.add(groupId[cx][cy]);
            }
        }
        return count % 10;
    }

    private static void bfs(Point start) {
        Deque<Point> deque = new LinkedList<>();
        visited[start.x][start.y] = true;
        groupId[start.x][start.y] = currentGroup;
        groupSize[currentGroup]++;
        deque.add(start);

        while (!deque.isEmpty()) {
            Point current = deque.poll();

            for (int i = 0; i < 4; i++) {
                int x = dx[i] + current.x;
                int y = dy[i] + current.y;

                if (x >= 0 && y >= 0 && x < n && y < m && !visited[x][y] && map[x][y] == 0) {
                    deque.add(new Point(x, y));
                    visited[x][y] = true;
                    groupId[x][y] = currentGroup;
                    groupSize[currentGroup]++;
                }
            }
        }
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
