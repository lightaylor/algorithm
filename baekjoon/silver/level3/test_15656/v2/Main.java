package silver.level3.test_15656.v2;

import java.io.*;
import java.util.Arrays;

public class Main {
    private static int N;
    private static int M;
    private static int[] arr;
    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        arr = new int[N];
        input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);
        dfs(0, new StringBuilder());
        bw.close();
    }

    private static void dfs(int idx, StringBuilder sb) throws IOException {
        if (idx == M) {
            bw.write(sb.toString().trim());
            bw.newLine();
            return;
        }

        for (int i = 0; i < N; i++) {
            int length = sb.length();
            sb.append(arr[i]).append(" ");
            dfs(idx + 1, sb);
            sb.delete(length, sb.length());
        }
    }
}
