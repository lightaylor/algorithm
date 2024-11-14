package gold.level3.test_16964.v1;

import java.io.*;
import java.util.*;

public class Main {
    private static boolean[] check;
    private static List<Integer>[] list;
    private static List<Integer> dfs_order;
    private static int[] parent_order;
    private static int answer;

    private static void DFS (int x) {
        if (check[x]) return;
        dfs_order.add(x);
        check[x] = true;
        for (int y : list[x]) {
            DFS(y);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        dfs_order = new ArrayList<>();
        list = new ArrayList[n];
        check = new boolean[n];
        parent_order = new int[n];
        int[] order = new int[n];
        answer = 1;

        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            list[a].add(b);
            list[b].add(a);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            order[i] = Integer.parseInt(st.nextToken()) - 1;
            parent_order[order[i]] = i;
        }

        for (int i = 0; i < n; i++) {
            list[i].sort(Comparator.comparingInt(u -> parent_order[u]));
        }

        DFS(0);
        for (int i = 0; i < n; i++) {
            if (dfs_order.get(i) != order[i]) {
                answer = 0;
                break;
            }
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
}
