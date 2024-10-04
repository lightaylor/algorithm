package silver.level2.test_15663;

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
    private static boolean[] checked;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nm = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        answer = new int[nm[1]];
        set = new LinkedHashSet<>();
        checked = new boolean[nm[0]];
        dfs(0, nm[0], nm[1]);

        for (String str : set) {
            bw.write(str);
            bw.newLine();
        }

        bw.close();
    }

    static void dfs(int idx, int n, int m) throws IOException {
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

        for (int i = 0; i < n; i++) {
            if (!checked[i]) {
                answer[idx] = arr[i];
                checked[i] = true;
                dfs(idx + 1, n, m);
                checked[i] = false;
            }
        }
    }
}
