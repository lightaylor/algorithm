package silver.level2.test_4963;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    private static final int[] xd = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] yd = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        while (a + b > 0) {
            int[][] arr = new int[b][];
            boolean[][] check = new boolean[b][a];

            for (int i = 0; i < b; i++) {
                arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }

            int count = 0;
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a; j++) {
                    if (arr[i][j] == 1 && !check[i][j]) {
                        count += 1;
                        BFS(arr, check, i, j, a, b);
                    }
                }
            }

            bw.write(String.valueOf(count));
            bw.newLine();

            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
        }

        bw.close();
    }

    private static void BFS (int[][] arr, boolean[][] check, int x, int y, int a, int b) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(x, y));

        while (!queue.isEmpty()) {
            Pair pair = queue.remove();

            for (int i = 0; i < xd.length; i ++) {
                x = pair.x + xd[i];
                y = pair.y + yd[i];

                if (0 <= x && x < b && 0 <= y && y < a) {
                    if (arr[x][y] == 1 && !check[x][y]) {
                        check[x][y] = true;
                        queue.add(new Pair(x, y));
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
