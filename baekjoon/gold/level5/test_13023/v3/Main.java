package gold.level5.test_13023.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Integer>[] list;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        visited = new boolean[N + 1];
        boolean answer = false;

        list = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 0; i <= N; i++) {
            if (dfs(i, 1)) {
                answer = true;
                break;
            }
        }
        System.out.print(answer ? 1 : 0);
    }

    private static boolean dfs(int current, int count) {
        if (count >= 5) {
            return true;
        }

        visited[current] = true;
        for (int i : list[current]) {
            if (!visited[i]) {
                visited[i] = true;
                if (dfs(i, count + 1)) {
                    return true;
                }
            }
        }
        visited[current] = false;
        return false;
    }
}
