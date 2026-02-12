package programmers._2021_kakao_blind_recruitement.minimize_revenue_decline;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer>[] tree;
    int[][] dp;
    int[] sales;

    public int solution(int[] sales, int[][] links) {
        int n = sales.length;
        this.sales = sales;

        tree = new ArrayList[n + 1];
        dp = new int[n + 1][2];

        for (int i = 1; i <= n; i++) tree[i] = new ArrayList<>();
        for (int[] link : links) tree[link[0]].add(link[1]);
        dfs(1);
        return Math.min(dp[1][0], dp[1][1]);
    }

    private void dfs(int node) {
        dp[node][1] = sales[node - 1];

        if (tree[node].isEmpty()) return;

        int extra = Integer.MAX_VALUE;
        boolean attendChild = false;

        for (int child : tree[node]) {
            dfs(child);

            if (dp[child][0] < dp[child][1]) {
                dp[node][1] += dp[child][0];
                dp[node][0] += dp[child][0];
                extra = Math.min(extra, dp[child][1] - dp[child][0]);
            } else {
                dp[node][1] += dp[child][1];
                dp[node][0] += dp[child][1];
                attendChild = true;
            }
        }
        if (!attendChild) {
            dp[node][0] += extra;
        }
    }
}
