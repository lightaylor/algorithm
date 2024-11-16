package silver.level2.test_15663.v3;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {
    private static int N;
    private static int M;
    private static int[] arr;
    private static boolean[] visited;
    private static LinkedHashSet<String> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        set = new LinkedHashSet<>();
        arr = new int[N];
        visited = new boolean[N];
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);
        dfs(0, new StringBuilder());

        for (String answer : set) {
            bw.write(answer);
            bw.newLine();
        }
        bw.close();
    }

    private static void dfs(int idx, StringBuilder sb) throws IOException {
        if (idx == M) {
            set.add(sb.toString().trim());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                int length = sb.length();
                sb.append(arr[i]).append(" ");
                dfs(idx + 1, sb);
                sb.delete(length, sb.length());
                visited[i] = false;
            }
        }
    }
}
