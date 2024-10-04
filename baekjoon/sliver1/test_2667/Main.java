package sliver1.test_2667;

import java.io.*;
import java.util.*;

public class Main {
    private static final int[] dx = {0, 0, 1, -1};
    private static final int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            char[] c = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                arr[i][j] = c[j] - '0';
            }
        }

        int count = 0;
        int[][] check = new int[n][n];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if(arr[x][y] == 1 && check[x][y] == 0) {
                    BFS(arr, check, x, y, ++count, n);
                }
            }
        }

        int[] answer = new int[count];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (check[i][j] != 0) {
                    answer[check[i][j] - 1] += 1;
                }
            }
        }

        Arrays.sort(answer);
        bw.write(String.valueOf(count));
        bw.newLine();
        for (int i : answer) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.close();
    }

    private static void BFS(int[][] arr, int[][] check, int x, int y, int count, int n) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(x, y));
        check[x][y] = count;

        while(!queue.isEmpty()) {
            Pair pair = queue.remove();
            x = pair.x;
            y = pair.y;
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                    if (arr[nx][ny] == 1 && check[nx][ny] == 0) {
                        queue.add(new Pair(nx, ny));
                        check[nx][ny] = count;
                    }
                }
            }
        }
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
