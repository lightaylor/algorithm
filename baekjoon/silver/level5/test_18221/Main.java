package silver.level5.test_18221;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] map = new int[n][n];
        int[] sunggyu = new int[2];
        int[] professor = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                if (num == 5) professor = new int[]{i, j};
                else if (num == 2) sunggyu = new int[]{i, j};
                map[i][j] = num;
            }
        }

        int count = 0;
        int a = (sunggyu[0] - professor[0]) * (sunggyu[0] - professor[0]);
        int b = (sunggyu[1] - professor[1]) * (sunggyu[1] - professor[1]);
        double d = Math.sqrt(a + b);

        for (int i = Math.min(sunggyu[0], professor[0]); i <= Math.max(sunggyu[0], professor[0]); i++) {
            for (int j = Math.min(sunggyu[1], professor[1]); j <= Math.max(sunggyu[1], professor[1]); j++) {
                if (map[i][j] == 1) count++;
            }
        }
        System.out.print(count >= 3 && d >= 5 ? 1 : 0);
    }
}
