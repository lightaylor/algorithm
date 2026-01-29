package baekjoon.gold.level4.test_13913.v1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static final int MAX = 1_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean[] check = new boolean[MAX];
        int[] dist = new int[MAX];
        int[] from = new int[MAX];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(a);
        from[a] = a;
        check[a] = true;
        while (!queue.isEmpty()) {
            int x = queue.remove();
            if (0 < x) {
                if (!check[x - 1]) {
                    dist[x - 1] = dist[x] + 1;
                    from[x - 1] = x;
                    check[x - 1] = true;
                    queue.add(x - 1);
                }
            }
            if (x + 1 < MAX) {
                if (!check[x + 1]) {
                    dist[x + 1] = dist[x] + 1;
                    from[x + 1] = x;
                    check[x + 1] = true;
                    queue.add(x + 1);
                }
            }
            if (x * 2 < MAX) {
                if (!check[x * 2]) {
                    dist[x * 2] = dist[x] + 1;
                    from[x * 2] = x;
                    check[x * 2] = true;
                    queue.add(x * 2);
                }
            }
            if (x == b) {
                break;
            }
        }

        bw.write(String.valueOf(dist[b]));
        bw.newLine();
        queue = new LinkedList<>();
        queue.add(b);
        StringBuilder answer = new StringBuilder();
        while (!queue.isEmpty()) {
            int x = queue.remove();
            queue.add(from[x]);
            answer.insert(0, x + " ");
            if (x == from[x]) {
                break;
            }
        }
        bw.write(answer.toString());
        bw.newLine();
        bw.close();
    }
}
