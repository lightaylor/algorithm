package gold.level5.test_13549.v3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.print(bfs(N, K));
    }

    private static int bfs(int N, int K) {
        boolean[] visited = new boolean[100_001];
        Deque<Status> queue = new ArrayDeque<>();
        queue.add(new Status(N, 0));
        visited[N] = true;

        while (!queue.isEmpty()) {
            Status status = queue.poll();
            int location = status.location;
            int sec = status.sec;

            if (location == K) {
                return sec;
            }

            if (location * 2 <= 100_000 && !visited[location * 2]) {
                visited[location * 2] = true;
                queue.addFirst(new Status(location * 2, sec));
            }

            if (location - 1 >= 0 && !visited[location - 1]) {
                visited[location - 1] = true;
                queue.addLast(new Status(location - 1, sec + 1));
            }

            if (location + 1 <= 100_000 && !visited[location + 1]) {
                visited[location + 1] = true;
                queue.addLast(new Status(location + 1, sec + 1));

            }
        }
        return -1;
    }

    static class Status {
        int location;
        int sec;

        public Status(int location, int sec) {
            this.location = location;
            this.sec = sec;
        }
    }
}
