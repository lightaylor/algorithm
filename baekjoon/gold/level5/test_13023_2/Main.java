package gold.level5.test_13023_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;
    private static List<Integer>[] FRIENDS;
    private static boolean[] VISITED;
    private static boolean FOUND;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        VISITED = new boolean[N];
        FOUND = false;

        FRIENDS = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            FRIENDS[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            FRIENDS[a].add(b);
            FRIENDS[b].add(a);
        }

        for (int i = 0; i < N; i++) {
            if (!FOUND) {
                dfs(i, 0);
            }
        }
        System.out.print(FOUND ? 1 : 0);
    }

    public static void dfs(int v, int depth) {
        if (depth == 4 || FOUND) {
            FOUND = true;
            return;
        }

        VISITED[v] = true;
        for (int friend : FRIENDS[v]) {
            if (!VISITED[friend]) {
                dfs(friend, depth + 1);
            }
        }
        VISITED[v] = false;
    }
}
