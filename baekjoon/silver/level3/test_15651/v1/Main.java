package silver.level3.test_15651.v1;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    private static int[] answer;
    private static StringBuffer sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuffer();

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        answer = new int[input[1]];
        dfs(0, input[0], input[1]);
        System.out.print(sb);
    }

    static void dfs (int idx, int n, int m) throws IOException {
        if (idx == m) {
            for (int i = 0; i < m; i++) {
                sb.append(answer[i]);
                if (i < m - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            answer[idx] = i;
            dfs(idx + 1, n, m);
        }
    }
}
