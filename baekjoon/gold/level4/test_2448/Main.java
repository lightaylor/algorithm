package gold.level4.test_2448;

import java.util.Scanner;

public class Main {

    private static char[][] stars;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        stars = new char[N][2 * N + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                stars[i][j] = ' ';
            }
        }

        drawStar(0, N - 1, N);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                sb.append(stars[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    private static void drawStar(int x, int y, int n) {
        if (n == 3) {
            stars[x][y] = '*';
            stars[x + 1][y - 1] = stars[x + 1][y + 1] = '*';
            stars[x + 2][y - 2] = stars[x + 2][y - 1] = stars[x + 2][y] = stars[x + 2][y + 1] = stars[x + 2][y + 2] = '*';
            return;
        }

        drawStar(x, y, n / 2);
        drawStar(x + n / 2, y - n / 2, n / 2);
        drawStar(x + n / 2, y + n / 2, n / 2);
    }
}
