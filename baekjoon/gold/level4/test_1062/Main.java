package baekjoon.gold.level4.test_1062;

import java.util.Scanner;

public class Main {
    private static int n, k, answer;
    private static int[] wordMasks;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        sc.nextLine();
        answer = 0;

        if (k < 5) {
            System.out.print(0);
            return;
        }

        visited = new boolean[26];
        char[] mandatory = new char[]{'a', 'n', 't', 'i', 'c'};
        for (char c : mandatory) visited[c - 'a'] = true;

        wordMasks = new int[n];
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            char[] words = word.substring(4, word.length() - 4).toCharArray();
            for (char c : words) wordMasks[i] |= (1 << (c - 'a'));
        }

        dfs(0, 0);
        System.out.print(answer);
    }

    private static void dfs(int idx, int count) {
        if (count == k - 5) {
            int readable = 0;

            for (int word : wordMasks) {
                boolean ok = true;
                for (int i = 0; i < 26; i++) {
                    if ((word & (1 << i)) != 0 && !visited[i]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) readable++;
            }
            answer = Math.max(answer, readable);
            return;
        }


        for (int i = idx; i < 26; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i + 1, count + 1);
                visited[i] = false;
            }
        }
    }
}
