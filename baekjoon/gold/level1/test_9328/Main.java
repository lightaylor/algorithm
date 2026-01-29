package baekjoon.gold.level1.test_9328;

import java.util.*;

public class Main {
    private static int H, W;
    private static char[][] map;
    private static boolean[][] visited;
    private static boolean[] keys;
    private static ArrayList<Point>[] gates;
    private static int answer;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        while (TC-- > 0) {
            H = sc.nextInt();
            W = sc.nextInt();
            sc.nextLine();

            map = new char[H + 2][W + 2];
            for (int i = 0; i < H + 2; i++) Arrays.fill(map[i], '.');

            for (int i = 1; i <= H; i++) {
                char[] line = sc.nextLine().toCharArray();
                if (W >= 0) System.arraycopy(line, 0, map[i], 1, W);
            }

            visited = new boolean[H + 2][W + 2];
            keys = new boolean[26];
            answer = 0;

            gates = new ArrayList[26];
            for (int i = 0; i < 26; i++) gates[i] = new ArrayList<>();

            String keyInput = sc.nextLine();
            if (!keyInput.equals("0")) {
                for (char c : keyInput.toCharArray()) keys[c - 'a'] = true;
            }

            bfs();
            System.out.println(answer);
        }
    }

    private static void bfs() {
        Queue<Point> queue = new ArrayDeque<>();
        queue.add(new Point(0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = current.x + dx[i];
                int y = current.y + dy[i];

                if (x < 0 || y < 0 || x >= H + 2 || y >= W + 2) continue;
                if (map[x][y] == '*' || visited[x][y]) continue;

                char cell = map[x][y];
                visited[x][y] = true;

                if (cell == '$') {
                    queue.add(new Point(x, y));
                    answer++;
                } else if (cell == '.') {
                    queue.add(new Point(x, y));
                } else if ('a' <= cell && cell <= 'z') {
                    queue.add(new Point(x, y));

                    int keyIndex = cell - 'a';
                    if (!keys[keyIndex]) {
                        for (Point gate : gates[keyIndex]) queue.add(gate);
                        keys[keyIndex] = true;
                        gates[keyIndex].clear();
                    }
                } else if (cell >= 'A' && cell <= 'Z') {
                    int keyIndex = cell - 'A';
                    if (keys[keyIndex]) queue.add(new Point(x, y));
                    else gates[keyIndex].add(new Point(x, y));
                }
            }
        }
    }

    public static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
