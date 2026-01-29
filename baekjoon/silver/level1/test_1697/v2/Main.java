package baekjoon.silver.level1.test_1697.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int MAX = 100_000;
    private static boolean[] visited = new boolean[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.print(bfs(N, K));
    }

    private static int bfs(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();
        int[] time = new int[MAX + 1];

        queue.add(N);
        visited[N] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == K) {
                return time[current];
            }

            if (current - 1 >= 0 && !visited[current - 1]) {
                queue.add(current - 1);
                visited[current - 1] = true;
                time[current - 1] = time[current] + 1;
            }

            if (current + 1 <= MAX && !visited[current + 1]) {
                queue.add(current + 1);
                visited[current + 1] = true;
                time[current + 1] = time[current] + 1;
            }

            if (current * 2 <= MAX && !visited[current * 2]) {
                queue.add(current * 2);
                visited[current * 2] = true;
                time[current * 2] = time[current] + 1;
            }
        }
        return -1;
    }
}
