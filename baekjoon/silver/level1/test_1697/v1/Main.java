package silver.level1.test_1697.v1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static final int MAX = 1_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean[] check = new boolean[MAX];
        int[] dist = new int[MAX];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(a);
        check[a] = true;
        while (!queue.isEmpty()) {
            int x = queue.remove();
            if (x - 1 >= 0) {
                if (!check[x - 1]) {
                    queue.add(x - 1);
                    check[x - 1] = true;
                    dist[x - 1] = dist[x] + 1;
                }
            }
            if (x + 1 < MAX) {
                if (!check[x + 1]) {
                    queue.add(x + 1);
                    check[x + 1] = true;
                    dist[x + 1] = dist[x] + 1;
                }
            }
            if (x * 2 < MAX) {
                if (!check[x * 2]) {
                    queue.add(x * 2);
                    check[x * 2] = true;
                    dist[x * 2] = dist[x] + 1;
                }
            }
        }
        bw.write(String.valueOf(dist[b]));
        bw.close();
    }
}
