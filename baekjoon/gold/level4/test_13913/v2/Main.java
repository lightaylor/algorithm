package baekjoon.gold.level4.test_13913.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static final int MAX = 100_000;
    private static int[] previous;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(bfs(N, K));
        printPath(N, K);
    }

    private static int bfs(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[MAX + 1];
        int[] time = new int[MAX + 1];
        previous = new int[MAX + 1];

        queue.add(N);
        visited[N] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == K) {
                return time[current];
            }

            if (0 <= current - 1 && !visited[current - 1]) {
                visited[current - 1] = true;
                queue.add(current - 1);
                time[current - 1] = time[current] + 1;
                previous[current - 1] = current;
            }
            if (current + 1 <= MAX && !visited[current + 1]) {
                visited[current + 1] = true;
                queue.add(current + 1);
                time[current + 1] = time[current] + 1;
                previous[current + 1] = current;
            }
            if (current * 2 <= MAX && !visited[current * 2]) {
                visited[current * 2] = true;
                queue.add(current * 2);
                time[current * 2] = time[current] + 1;
                previous[current * 2] = current;
            }
        }

        return -1;
    }

    private static void printPath(int N, int K) {
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> path = new LinkedList<>();

        for (int i = K; i != N; i = previous[i]) {
            path.addFirst(i);
        }
        path.addFirst(N);

        for (int position : path) {
            sb.append(position).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
