package silver.level3.test_15651.v3;

import java.io.*;

public class Main {
    private static int N;
    private static int M;
    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        dfs(0, new StringBuilder());
        bw.close();
    }

    private static void dfs(int idx, StringBuilder sb) throws IOException {
        if (idx == M) {
            bw.write(sb.toString().trim());
            bw.newLine();
            return;
        }

        for (int i = 1; i <= N; i++) {
            sb.append(i).append(" ");
            dfs(idx + 1, sb);
            sb.delete(sb.length() - 2, sb.length());
        }
    }
}
