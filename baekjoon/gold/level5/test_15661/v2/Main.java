package gold.level5.test_15661.v2;

import java.util.Scanner;

public class Main {

    private static int N;
    private static boolean[] visited;
    private static int[][] arr;
    private static int min;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][N];
        visited = new boolean[N];
        min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        dfs(0);
        System.out.print(min);
    }

    private static void dfs(int start) {
        min = Math.min(min, getSumDiff());

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i + 1);
                visited[i] = false;
            }
        }
    }

    private static int getSumDiff() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i] && visited[j]) {
                    start += arr[i][j];
                } else if (!visited[i] && !visited[j]) {
                    link += arr[i][j];
                }
            }
        }
        return Math.abs(start - link);
    }
}
