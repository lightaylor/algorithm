package baekjoon.gold.level5.test_1759.v3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final String[] aeiou = {"a", "e", "i", "o", "u"};
    private static String[] arr;
    private static int L;
    private static int C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        C = sc.nextInt();
        sc.nextLine();

        arr = sc.nextLine().split(" ");
        Arrays.sort(arr);
        dfs(0, 0, new StringBuilder(), 0);
    }

    private static void dfs(int start, int idx, StringBuilder sb, int count) {
        if (idx == L) {
            if (count >= 1 && L - count >= 2) {
                System.out.println(sb.toString());
            }
            return;
        }

        for (int i = start; i < C; i++) {
            int length = sb.length();
            String key = arr[i];

            sb.append(key);
            dfs(i + 1, idx + 1, sb, Arrays.asList(aeiou).contains(key) ? count + 1 : count);
            sb.delete(length, sb.length());
        }
    }
}
