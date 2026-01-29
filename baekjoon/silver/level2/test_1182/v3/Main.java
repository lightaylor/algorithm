package baekjoon.silver.level2.test_1182.v3;

import java.util.Scanner;

public class Main {

    private static int answer;
    private static int N;
    private static int S;
    private static boolean[] visited;
    private static int[] num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();
        answer = 0;
        visited = new boolean[N];

        num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        dfs(0, 0, 0);
        System.out.print(answer);
    }

    private static void dfs(int idx, int sum, int start) {
        answer += sum == S && idx > 0 ? 1 : 0;
        if (idx == N) {
            return;
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(idx + 1, sum + num[i], i + 1);
                visited[i] = false;
            }
        }
    }
}
