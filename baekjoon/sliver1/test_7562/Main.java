package sliver1.test_7562;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static final int[] dx = {-1, 1, 2, 2, 1, -1, -2, -2};
    private static final int[] dy = {-2, -2, -1, 1, 2, 2, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int l = Integer.parseInt(br.readLine());
            int[][] arr = new int[l][l];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start_x = Integer.parseInt(st.nextToken());
            int start_y = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int end_x = Integer.parseInt(st.nextToken());
            int end_y = Integer.parseInt(st.nextToken());
            boolean[][] check = new boolean[l][l];

            Queue<Pair> queue = new LinkedList<>();
            queue.add(new Pair(start_x, start_y));
            check[start_x][start_y] = true;
            while (!queue.isEmpty()) {
                Pair pair = queue.remove();
                for (int j = 0; j < 8; j++) {
                    int x = dx[j] + pair.x;
                    int y = dy[j] + pair.y;
                    if (0 <= x && x < l && 0 <= y && y < l) {
                        if (!check[x][y]) {
                            check[x][y] = true;
                            queue.add(new Pair(x, y));
                            arr[x][y] = arr[pair.x][pair.y] + 1;
                        }
                    }
                }
            }

            bw.write(String.valueOf(arr[end_x][end_y]));
            bw.newLine();
        }

        bw.close();
    }
}

class Pair {
    int x ;
    int y;

    Pair (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
