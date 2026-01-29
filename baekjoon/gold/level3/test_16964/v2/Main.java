package baekjoon.gold.level3.test_16964.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static boolean[] check;
    private static List<Integer>[] graph;
    private static List<Integer> targetOrder;
    private static int[] dfsOrder;
    private static int targetIndex;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        check = new boolean[n + 1];

        graph = new List[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            String[] st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);

            graph[a].add(b);
            graph[b].add(a);
        }

        targetOrder = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            targetOrder.add(Integer.parseInt(st.nextToken()));
        }

        dfsOrder = new int[n + 1];
        for (int i = 0; i < n; i++) {
            dfsOrder[targetOrder.get(i)] = i;
        }

        for (int i = 1; i <= n; i++) {
            graph[i].sort(Comparator.comparingInt(a -> dfsOrder[a]));
        }

        targetIndex = 0;
        System.out.print(dfs(1) && targetIndex == n ? 1 : 0);
    }

    private static boolean dfs(int node) {
        if (check[node]) return false;
        check[node] = true;

        if (node != targetOrder.get(targetIndex++)) {
            return false;
        }

        for (int next : graph[node]) {
            if (!check[next]) {
                if (!dfs(next)) {
                    return false;
                }
            }
        }
        return true;
    }
}
