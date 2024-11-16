package silver.level3.test_15655.v3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int N;
    private static int M;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        dfs(0, 0, new StringBuilder());
    }

    private static void dfs(int idx, int start, StringBuilder sb) {
        if (idx == M) {
            System.out.println(sb.toString().trim());
            return;
        }

        for (int i = start; i < N; i++) {
            int length = sb.length();
            sb.append(arr[i]).append(" ");
            dfs(idx + 1, i + 1, sb);
            sb.delete(length, sb.length());
        }
    }
}
