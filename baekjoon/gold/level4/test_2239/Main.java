package gold.level4.test_2239;

import java.util.Scanner;

public class Main {
    private static char[][] map;
    private static boolean[][] row;
    private static boolean[][] col;
    private static boolean[][] box;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        map = new char[9][9];
        row = new boolean[9][10];
        col = new boolean[9][10];
        box = new boolean[9][10];

        for (int r = 0; r < 9; r++) {
            map[r] = sc.nextLine().toCharArray();
            for (int c = 0; c < 9; c++) {
                if (map[r][c] != '0') {
                    int d = map[r][c] - '0';
                    row[r][d] = true;
                    col[c][d] = true;
                    box[getIndex(r, c)][d] = true;
                }
            }
        }

        dfs(0, 0);
    }

    private static boolean dfs(int r, int c) {
        if (c == 9) { r++;c = 0; }
        if (r == 9) { print(); return true; }
        if (map[r][c] != '0') return dfs(r, c + 1);

        int b = getIndex(r, c);
        for (int j = 1; j < 10; j++) {
            if(row[r][j] || col[c][j] || box[b][j]) continue;

            map[r][c] = (char) (j + '0');
            row[r][j] = true;
            col[c][j] = true;
            box[b][j] = true;

            if (dfs(r, c + 1)) return true;

            map[r][c] = '0';
            row[r][j] = false;
            col[c][j] = false;
            box[b][j] = false;
        }
        return false;
    }

    private static int getIndex(int r, int c) {
        return (r / 3) * 3 + (c / 3);
    }

    private static void print() {
        for (char[] line : map) {
            System.out.println(line);
        }
    }
}
