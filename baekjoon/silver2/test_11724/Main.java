package silver2.test_11724;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static List<Integer>[] list;
    private static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        list = (List<Integer>[]) new List[n + 1];
        check = new boolean[n + 1];
        int answer = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            if(!check[i]) {
                dfs(i);
                answer += 1;
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }

    private static void dfs(int x) {
        if (check[x]) {
            return;
        }

        check[x] = true;
        for (int i : list[x]) {
            if (!check[i]) {
                dfs(i);
                check[i] = true;
            }
        }
    }
}
