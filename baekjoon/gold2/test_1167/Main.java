package gold2.test_1167;

import java.io.*;
import java.util.*;

class Edge {
    int to, cost;
    Edge (int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}

public class Main {
    private static List<Edge>[] list;
    private static boolean[] check;
    private static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        list = new ArrayList[n + 1];
        check = new boolean[n + 1];
        dist = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            while (to > -1) {
                int cost = Integer.parseInt(st.nextToken());
                list[from].add(new Edge(to, cost));
                list[to].add(new Edge(from, cost));
                to = Integer.parseInt(st.nextToken());
            }
        }
        BFS(1);
        int start = 1;
        for (int i = 2; i <= n; i++) {
            if (dist[i] > dist[start]) {
                start = i;
            }
        }
        BFS(start);
        int answer = dist[1];
        for (int i = 2; i <= n; i++) {
            if (answer < dist[i]) {
                answer = dist[i];
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }

    private static void BFS(int start) {
        Arrays.fill(dist, 0);
        Arrays.fill(check, false);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        check[start] = true;
        while (!queue.isEmpty()) {
            int x = queue.remove();
            for (Edge e : list[x]) {
                if (!check[e.to]) {
                    dist[e.to] = dist[x] + e.cost;
                    queue.add(e.to);
                    check[e.to] = true;
                }
            }
        }
    }
}
