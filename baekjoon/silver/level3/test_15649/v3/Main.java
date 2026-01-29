package baekjoon.silver.level3.test_15649.v3;

import java.util.Scanner;

public class Main {
    private static boolean[] check;
    private static int N;
    private static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        check = new boolean[N + 1];
        dfs(0, new StringBuilder());
    }

    private static void dfs(int idx, StringBuilder sb) {
        if (idx == M) {
            System.out.println(sb.toString().trim());
        }

        for (int i = 1; i <= N; i++) {
            if (!check[i]) {
                check[i] = true;
                sb.append(i).append(" ");
                dfs(idx + 1, sb);
                sb.delete(sb.length() - 2, sb.length());
                check[i] = false;
            }
        }
    }
}
