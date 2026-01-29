package baekjoon.gold.level3.test_2342;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] steps = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] energy = {
            {0, 2, 2, 2, 2},
            {2, 1, 3, 4, 3},
            {2, 3, 1, 3, 4},
            {2, 4, 3, 1, 3},
            {2, 3, 4, 3, 1}
        };

        int[][] dp = new int[5][5];
        for (int i = 0; i < 5; i++) Arrays.fill(dp[i], Integer.MAX_VALUE);
        dp[0][0] = 0;

        for (int next : steps) {
            if (next == 0) break;

            int[][] newDP = new int[5][5];
            for (int i = 0; i < 5; i++)
                Arrays.fill(newDP[i], Integer.MAX_VALUE);

            for (int L = 0; L < 5; L++) {
                for (int R = 0; R < 5; R++) {
                    int current = dp[L][R];
                    if (current == Integer.MAX_VALUE) continue;
                    newDP[next][R] = Math.min(newDP[next][R], current + energy[L][next]);
                    newDP[L][next] = Math.min(newDP[L][next], current + energy[R][next]);
                }
            }
            dp = newDP;
        }

        int answer = Integer.MAX_VALUE;
        for (int L = 0; L < 5; L++) {
            for (int R = 0; R < 5; R++) {
                answer = Math.min(answer, dp[L][R]);
            }
        }

        System.out.print(answer);
    }
}
