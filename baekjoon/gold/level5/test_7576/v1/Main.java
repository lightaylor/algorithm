package gold.level5.test_7576.v1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    private static final int[] xd = {-1, 1, 0, 0};
    private static final int[] yd = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][n];
        int[][] dist = new int[m][n];
        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    queue.add(new Pair(i, j));
                    dist[i][j] = 0;
                } else {
                    dist[i][j] = -1;
                }
            }
        }

        while (!queue.isEmpty()) {
            Pair pair = queue.remove();
            for (int i = 0; i < 4; i++) {
                int x = pair.x + xd[i];
                int y = pair.y + yd[i];
                if (0 <= x && x < m && 0 <= y && y < n) {
                    if (dist[x][y] == -1 && arr[x][y] == 0) {
                        queue.add(new Pair(x, y));
                        dist[x][y] = dist[pair.x][pair.y] + 1;
                    }
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (answer < dist[i][j]) {
                    answer = dist[i][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0 && dist[i][j] == -1) {
                    answer = -1;
                    break;
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
