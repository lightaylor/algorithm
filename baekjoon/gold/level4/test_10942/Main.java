package baekjoon.gold.level4.test_10942;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        boolean[][] dp = new boolean[n][n];

        for (int i = 0; i < n; i++) dp[i][i] = true;
        for (int i = 0; i + 1 < n; i++) dp[i][i + 1] = (arr[i] == arr[i + 1]);
        for (int len = 3; len <= n; len++) {
            for (int s = 0; s + len - 1 < n; s++) {
                int e = s + len - 1;
                dp[s][e] = (arr[s] == arr[e]) && dp[s + 1][e - 1];
            }
        }

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end   = Integer.parseInt(st.nextToken()) - 1;
            out.append(dp[start][end] ? 1 : 0).append('\n');
        }
        System.out.print(out);
    }
}
