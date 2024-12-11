package silver.level2.test_2630;

import java.util.Scanner;

public class Main {

    private static int[][] arr;
    private static int white;
    private static int blue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        white = 0;
        blue = 0;
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        divideAndCount(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void divideAndCount(int x, int y, int size) {
        if (isUniform(x, y, size)) {
            if (arr[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int newSize = size / 2;
        divideAndCount(x, y, newSize);
        divideAndCount(x + newSize, y, newSize);
        divideAndCount(x, y + newSize, newSize);
        divideAndCount(x + newSize, y + newSize, newSize);
    }

    private static boolean isUniform(int x, int y, int size) {
        int type = arr[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (type != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
