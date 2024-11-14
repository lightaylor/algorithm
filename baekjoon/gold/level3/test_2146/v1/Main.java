package gold.level3.test_2146.v1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Main {
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Pair> queue = new LinkedList<>();
        int[][] arr = new int[n][n];
        int[][] group = new int[n][n];
        int[][] distance = new int[n][n];

        for (int i = 0; i < n; i++) {
            arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1 && group[i][j] == 0) {
                    group[i][j] = ++cnt;
                    queue.add(new Pair(i, j));
                    while(!queue.isEmpty()) {
                        Pair pair = queue.remove();
                        for (int k = 0; k < 4; k++) {
                            int nx = pair.x + dx[k];
                            int ny = pair.y + dy[k];
                            if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                                if (arr[nx][ny] == 1 && group[nx][ny] == 0) {
                                    group[nx][ny] = cnt;
                                    queue.add(new Pair(nx, ny));
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distance[i][j] = -1;
                if (arr[i][j] == 1) {
                    queue.add(new Pair(i, j));
                    distance[i][j] = 0;
                }
            }
        }
        while (!queue.isEmpty()) {
            Pair pair = queue.remove();
            for (int k = 0; k < 4; k++) {
                int nx = pair.x + dx[k];
                int ny = pair.y + dy[k];
                if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                    if (distance[nx][ny] == -1) {
                        distance[nx][ny] = distance[pair.x][pair.y] + 1;
                        group[nx][ny] = group[pair.x][pair.y];
                        queue.add(new Pair(nx, ny));
                    }
                }
            }
        }

        int answer = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                        if (group[i][j] != group[nx][ny]) {
                            if (answer == -1 || answer > distance[i][j] + distance[nx][ny]) {
                                answer = distance[i][j] + distance[nx][ny];
                            }
                        }
                    }
                }
            }
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
}

class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
