package baekjoon.silver.level2.test_15666;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    private static BufferedWriter bw;
    private static int[] answer;
    private static int[] arr;
    private static Set<String> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nm = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        answer = new int[nm[1]];
        set = new LinkedHashSet<>();
        dfs(0, 0, arr.length, nm[1]);

        for (String str : set) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }

    static void dfs (int idx, int start, int n, int m) throws IOException {
        if (idx == m) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                sb.append(answer[i]);
                if (i < m - 1) {
                    sb.append(" ");
                }
            }
            set.add(sb.toString());
            return;
        }

        for (int i = start; i < n; i++) {
            answer[idx] = arr[i];
            dfs(idx + 1, i, n, m);
        }
    }
}
