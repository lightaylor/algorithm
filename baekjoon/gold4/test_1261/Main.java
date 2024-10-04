package gold4.test_1261;

import java.io.*;
import java.util.*;

public class Main {
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[b][a];
        int[][] d = new int[b][a];
        for (int i = 0; i < b; i++) {
            String s = br.readLine();
            for (int j = 0; j < a; j++) {
                arr[i][j] = s.charAt(j) - '0';
                d[i][j] = -1;
            }
        }

        Deque<Pair> deque = new ArrayDeque<>();
        deque.add(new Pair(0, 0));
        d[0][0] = 0;
        while (!deque.isEmpty()) {
            Pair p = deque.remove();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + p.x;
                int ny = dy[i] + p.y;
                if (0 <= nx && nx < b && 0 <= ny && ny < a && d[nx][ny] == -1) {
                    if (arr[nx][ny] == 0) {
                        d[nx][ny] = d[p.x][p.y];
                        deque.addFirst(new Pair(nx, ny));
                    } else {
                        d[nx][ny] = d[p.x][p.y] + 1;
                        deque.addLast(new Pair(nx, ny));
                    }
                }
            }
        }
        bw.write(String.valueOf(d[b - 1][a - 1]));
        bw.close();
    }
}

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}