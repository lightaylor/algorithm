package gold.level5.test_13549_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final int MAX = 100_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.print(bfs(N, K));
    }

    private static int bfs(int N, int K) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[MAX + 1];

        queue.add(new int[]{N, 0});
        visited[N] = true;

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int current = node[0];
            int time = node[1];

            if (current == K) {
                return time;
            }

            if (current * 2 <= MAX && !visited[current * 2]) {
                visited[current * 2] = true;
                queue.add(new int[]{current * 2, time});
            }

            if (current - 1 >= 0 && !visited[current - 1]) {
                visited[current - 1] = true;
                queue.add(new int[]{current - 1, time + 1});
            }

            if (current + 1 <= MAX && !visited[current + 1]) {
                visited[current + 1] = true;
                queue.add(new int[]{current + 1, time + 1});
            }
        }

        return -1;
    }
}
