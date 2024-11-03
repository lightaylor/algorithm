package gold.level5.test_7576_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static final int[] DX = {0, 0, -1, 1};
    private static final int[] DY = {-1, 1, 0, 0};
    private static int M;
    private static int N;
    private static int[][] TOMATO;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        Queue<int[]> queue = new LinkedList<>();
        TOMATO = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                TOMATO[i][j] = Integer.parseInt(arr[j]);
                if (TOMATO[i][j] == 1) {
                    queue.add(new int[]{i, j, 0});
                }
            }
        }

        int day = bfs(queue);
        for (int i = 0; i < N; i++) {
            if (Arrays.stream(TOMATO[i]).anyMatch(status -> status == 0)) {
                day = -1;
                break;
            }
        }
        System.out.print(day);
    }

    private static int bfs(Queue<int[]> queue) {
        int day = 0;

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = arr[0] + DX[i];
                int ny = arr[1] + DY[i];
                day = arr[2];

                if (0 <= nx && nx < N && 0 <= ny && ny < M) {
                    if (TOMATO[nx][ny] == 0) {
                        queue.add(new int[]{nx, ny, arr[2] + 1});
                        TOMATO[nx][ny] = 1;
                    }
                }
            }
        }
        return day;
    }
}
