package baekjoon.gold.level4.test_1987;

import java.util.Scanner;

public class Main {

    static private boolean[] alphabet;
    static private char[][] map;
    static private int answer;
    static private int[] dx = {0, 0, 1, -1};
    static private int[] dy = {1, -1, 0, 0};
    static private int R;
    static private int C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        sc.nextLine();

        map = new char[R][C];
        for (int i = 0; i < R; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        answer = 0;
        alphabet = new boolean[26];
        alphabet[map[0][0] -'A'] = true;
        dfs(new Point(0, 0, 1));
        System.out.print(answer);
    }

    static private void dfs(Point point) {

        if (answer < point.count) {
            answer = point.count;
        }

        for (int i = 0; i < 4; i++) {
            int x = point.x + dx[i];
            int y = point.y + dy[i];
            int count = point.count;

            if (0 <= x && x < R && 0 <= y && y < C && !alphabet[map[x][y] - 'A']) {
                alphabet[map[x][y] -'A'] = true;
                dfs(new Point(x, y, count + 1));
                alphabet[map[x][y] -'A'] = false;
            }
        }
    }

    static class Point {
        int x, y, count;

        public Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
