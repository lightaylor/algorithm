package baekjoon.gold.level3.test_1248.v3;

import java.util.Scanner;

public class Main {

    private static int n;
    private static char[][] sign;
    private static int[] answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();

        sign = new char[n][n];
        char[] charArray = sc.nextLine().toCharArray();
        answer = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sign[i][j] = charArray[idx++];
            }
        }

        dfs(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(answer[i]).append(" ");
        }
        System.out.print(sb.toString().trim());
    }

    private static boolean dfs(int idx) {
        if (idx == n) {
            return true;
        }

        for (int i = -10; i <= 10; i++) {
            answer[idx] = i;
            if (isValid(idx)) {
                if (dfs(idx + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValid(int idx) {
        for (int i = 0; i <= idx; i++) {
            int sum = 0;
            for (int j = i; j <= idx; j++) {
                sum += answer[j];
                if (sign[i][j] == '-' && sum >= 0) {
                    return false;
                } else if (sign[i][j] == '+' && sum <= 0) {
                    return false;
                } else if (sign[i][j] == '0' && sum != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
