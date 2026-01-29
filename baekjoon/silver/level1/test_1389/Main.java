package baekjoon.silver.level1.test_1389;

import java.util.*;

public class Main {

    private static List<Integer>[] list;
    private static int index;
    private static int minSum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        list = new List[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }

        index = 0;
        minSum = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            bfs(i, N);
        }

        System.out.print(index);
    }

    private static void bfs(int idx, int N) {
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(idx);
        int[] arr = new int[N + 1];
        visited[idx] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int i : list[current]) {
                if (!visited[i]) {
                    visited[i] = true;
                    arr[i] = arr[current] + 1;
                    queue.add(i);
                }
            }
        }

        int temp = Arrays.stream(arr).sum();
        if (temp < minSum) {
            minSum = temp;
            index = idx;
        }
    }
}
