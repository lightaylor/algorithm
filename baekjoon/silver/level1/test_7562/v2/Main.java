package baekjoon.silver.level1.test_7562.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Main {
    private static int N;
    private static final int[] DX = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static final int[] DY = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            N = Integer.parseInt(br.readLine());
            int[] start = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] end = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (start[0] == end[0] && start[1] == end[1]) {
                System.out.println(0);
            } else {
                System.out.println(bfs(start, end));
            }
        }
    }

    private static int bfs(int[] start, int[] end) {
        boolean[][] visited = new boolean[N][N];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();

            for (int i = 0; i < DX.length; i++) {
                int x = arr[0] + DX[i];
                int y = arr[1] + DY[i];

                if (x == end[0] && y == end[1]) {
                    return arr[2] + 1;
                }

                if (0 <= x && x < N && 0 <= y && y < N) {
                    if (!visited[x][y]) {
                        queue.add(new int[]{x, y, arr[2] + 1});
                        visited[x][y] = true;
                    }
                }
            }
        }
        return -1;
    }
}
