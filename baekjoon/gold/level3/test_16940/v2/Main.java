package baekjoon.gold.level3.test_16940.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    private static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        int[] order = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (isValidBFS(n, order)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }

    public static boolean isValidBFS(int N, int[] order) {
        if (order[0] != 1) {
            return false;
        }

        int[] position = new int[N + 1];
        for (int i = 0; i < N; i++) {
            position[order[i]] = i;
        }

        for (int i = 1; i <= N; i++) {
            graph[i].sort(Comparator.comparingInt(node -> position[node]));
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];
        int index = 1;

        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int y : graph[x]) {
                if (!visited[y]) {
                    if (y != order[index]) {
                        return false;
                    }
                    queue.add(y);
                    visited[y] = true;
                    index++;
                }
            }
        }
        return true;
    }
}
