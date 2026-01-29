package baekjoon.silver.level3.test_10974.v3;

import java.util.Scanner;

public class Main {
    private static int N;
    private static int[] arr;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new int[N];
        visited = new boolean[N];
        for (int i = 1; i <= N; i++) {
            arr[i - 1] = i;
        }
        dfs(0, new StringBuilder());
    }

    private static void dfs(int idx, StringBuilder sb) {
        if (idx == N) {
            System.out.println(sb.toString().trim());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(idx + 1, sb.append(arr[i]).append(" "));
                sb.delete(sb.length() - 2, sb.length());
                visited[i] = false;
            }
        }
    }
}
