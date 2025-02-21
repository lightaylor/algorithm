package gold.level2.test_3109;

import java.util.Scanner;

public class Main {
    private static final int[] move = {-1, 0, 1};
    private static char[][] map;
    private static boolean[][] visited;
    private static int n, m, count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        count = 0;
        visited = new boolean[n][m];
        map = new char[n][];
        for (int i = 0; i < n; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            if (dfs(i, 0)) count++;
        }
        System.out.print(count);
    }

    private static boolean dfs(int x, int y) {
        if (y == m - 1) {
            return true;
        }

        for (int m : move) {
            int dx = m + x;
            int dy = y + 1;
            if (0 <= dx && dx < n && map[dx][dy] == '.' && !visited[dx][dy]) {
                visited[dx][dy] = true;
                if (dfs(dx, dy)) return true;
            }
        }
        return false;
    }
}
