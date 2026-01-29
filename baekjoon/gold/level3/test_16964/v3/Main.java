package baekjoon.gold.level3.test_16964.v3;

import java.util.*;

public class Main {

    private static List<Integer>[] list;
    private static boolean[] visited;
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        visited = new boolean[N + 1];
        list = new List[N + 1];
        for (int i = 0; i <= N; i++) {
            list[i] = new ArrayList();
        }

        for (int i = 1; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        sc.nextLine();

        String order = sc.nextLine();
        int[] position = new int[N + 1];
        int[] orders = Arrays.stream(order.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < N; i++) {
            position[orders[i]] = i + 1;
        }

        for (int i = 1; i <= N; i++) {
            list[i].sort(Comparator.comparingInt(node -> position[node]));
        }

        StringBuilder sb = new StringBuilder();
        visited[1] = true;
        dfs(1, sb);

        System.out.print(sb.toString().trim().equals(order) ? 1 : 0);
    }

    private static void dfs(int start, StringBuilder sb) {
        sb.append(start).append(" ");

        for (int i : list[start]) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i, sb);
            }
        }
    }
}
