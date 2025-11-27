package gold.level2.test_20303;

import java.util.*;

public class Main {
    private static List<List<Integer>> list;
    private static boolean[] visited;
    private static int[] candies;
    private static int[] dp;
    private static List<int[]> comps;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        visited = new boolean[n + 1];
        candies = new int[n + 1];
        list = new ArrayList<>();
        comps = new ArrayList<>();
        for (int i = 0; i <= n; i++) list.add(new ArrayList<>());

        for (int i = 1; i <= n; i++) candies[i] = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                bfs(i);
            }
        }

        dp = new int[n + 1];
        for (int[] comp : comps) {
            int cnt = comp[0];
            int val = comp[1];

            for (int i = k - 1; i >= cnt; i--) {
                dp[i] = Math.max(dp[i], dp[i - cnt] + val);
            }
        }

        System.out.print(dp[k - 1]);
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);

        int sum = candies[start];
        int count = 1;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int next : list.get(now)) {
                if (visited[next]) continue;
                sum += candies[next];
                queue.add(next);
                visited[next] = true;
                count++;
            }
        }
        comps.add(new int[]{count, sum});
    }
}
