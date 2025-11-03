package gold.level3.test_1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] time = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++)
                time[i] = Integer.parseInt(st.nextToken());

            int[] depth = new int[n + 1];
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < n + 1; i++) graph.add(new ArrayList<>());
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());

                graph.get(u).add(v);
                depth[v]++;
            }

            int[] dp = new int[n + 1];
            if (n >= 0) System.arraycopy(time, 1, dp, 1, n);

            Deque<Integer> deque = new LinkedList<>();
            for (int i = 1; i <= n; i++) if (depth[i] == 0) deque.add(i);
            while (!deque.isEmpty()) {
                int current = deque.poll();

                for (int next : graph.get(current)) {
                    dp[next] = Math.max(dp[next], dp[current] + time[next]);
                    if (--depth[next] == 0) deque.add(next);
                }
            }

            System.out.println(dp[Integer.parseInt(br.readLine())]);
        }
    }
}
