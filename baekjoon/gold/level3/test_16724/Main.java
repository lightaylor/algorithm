package gold.level3.test_16724;

import java.util.Scanner;

public class Main {
    private static char[][] map;
    private static int[][] status;
    private static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();

        map = new char[x][y];
        status = new int[x][y];
        answer = 0;
        for (int i = 0; i < x; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (status[i][j] == 0) dfs(i, j);
            }
        }
        System.out.print(answer);
    }

    private static void dfs(int x, int y) {
        status[x][y] = 1;

        int nx = x;
        int ny = y;
        switch (map[x][y]) {
            case 'U':
                nx = x - 1;
                break;
            case 'D':
                nx = x + 1;
                break;
            case 'L':
                ny = y - 1;
                break;
            case 'R':
                ny = y + 1;
                break;
        }

        if (status[nx][ny] == 0) {
            dfs(nx, ny);
        } else if (status[nx][ny] == 1) {
            answer++;
        }
        status[x][y] = 2;
    }
}
