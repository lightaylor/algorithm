package silver.level2.test_1260.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int N;
    private static List[] EDGE;
    private static boolean[] CHECK;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        CHECK = new boolean[N + 1];

        EDGE = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            EDGE[i] = new ArrayList();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            EDGE[a].add(b);
            EDGE[b].add(a);
            Collections.sort(EDGE[a]);
            Collections.sort(EDGE[b]);
        }

        System.out.print(v);
        dfs(v);
        System.out.println();
        bfs(v);
        System.out.println();
    }

    private static void dfs(int start) {
        CHECK[start] = true;
        List<Integer> list = EDGE[start];
        for (int i : list) {
            if (CHECK[i]) continue;
            System.out.print(" " + i);
            dfs(i);
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        CHECK = new boolean[N + 1];
        queue.add(start);
        CHECK[start] = true;

        while (!queue.isEmpty()) {
            int i = queue.poll();
            System.out.print(i);

            for (int j : (List<Integer>) EDGE[i]) {
                if (CHECK[j]) continue;
                queue.add(j);
                CHECK[j] = true;
            }

            if(!queue.isEmpty()) {
                System.out.print(" ");
            }
        }
    }
}
