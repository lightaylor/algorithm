package baekjoon.bronze.level1.test_17247.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] target = new int[2][2];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (sc.nextInt() == 1) {
                    target[index][0] = i;
                    target[index++][1] = j;
                }
            }
        }

        int answer = Math.abs(target[0][0] - target[1][0]) + Math.abs(target[0][1] - target[1][1]);
        System.out.print(answer);
    }
}
