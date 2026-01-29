package baekjoon.bronze.level2.test_31945;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] pArr = {{0, 0, 0}, {0, 0, 1}, {0, 1, 0}, {0, 1, 1}, {1, 0, 0}, {1, 0, 1}, {1, 1, 0}, {1, 1, 1}};
        for (int i = 0; i < n; i++) {
            int[] p = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            boolean bool = false;
            for (int j = 0; j < 3; j++) {
                int sum = pArr[p[0]][j] + pArr[p[1]][j] + pArr[p[2]][j] + pArr[p[3]][j];

                if (0 == sum || sum == 4) {
                    bool = true;
                    break;
                }
            }

            System.out.println(bool ? "YES" : "NO");
        }
    }
}
