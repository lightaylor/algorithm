package silver.level2.test_15664;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    private static BufferedWriter bw;
    private static int[] arr;
    private static Set<String> set;
    private static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nm = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        answer = new int[nm[1]];
        set = new LinkedHashSet<>();
        dfs(0, 0, nm[0], nm[1]);

        for (String str : set) {
            bw.write(str);
            bw.newLine();
        }

        bw.close();
    }

    static void dfs(int idx, int start, int n, int m) throws IOException {
        if (idx == m) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < m; i++) {
                str.append(answer[i]);
                if (i < m - 1) {
                    str.append(" ");
                }
            }
            set.add(String.valueOf(str));
            return;
        }

        for (int i = start; i < n; i++) {
            answer[idx] = arr[i];
            dfs(idx + 1, i + 1, n, m);
        }
    }
}
