package silver.level2.test_11724.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int COUNT;
    private static List[] EDGE;
    private static boolean[] CHECK;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        CHECK = new boolean[N + 1];
        COUNT = N;

        EDGE = new List[N + 1];
        for (int i = 1; i <= N; i++) {
            EDGE[i] = new ArrayList();
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            EDGE[a].add(b);
            EDGE[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            if (CHECK[i]) continue;
            dfs(0, i);
        }
        System.out.print(COUNT);
    }

    private static void dfs(int idx, int start) {
        List<Integer> list = EDGE[start];
        CHECK[start] = true;

        for (int i : list) {
            if (CHECK[i]) continue;
            COUNT--;
            dfs(idx + 1, i);
        }
    }
}
