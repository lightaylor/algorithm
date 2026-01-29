package baekjoon.gold.level4.test_1106;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();

        int limit = c + 100;
        int INF = Integer.MAX_VALUE - limit;

        int[] arr = new int[limit + 1];
        Arrays.fill(arr, INF);
        arr[0] = 0;

        for (int i = 0; i < n; i++) {
            int cost = sc.nextInt();
            int num = sc.nextInt();
            for (int x = num; x <= limit; x++) {
                arr[x] = Math.min(arr[x], arr[x - num] + cost);
            }
        }

        int ans = INF;
        for (int x = c; x <= limit; x++) ans = Math.min(ans, arr[x]);
        System.out.print(ans);
    }
}

