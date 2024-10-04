package silver.level3.test_2606;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    private static int[][] arr;
    private static int count;
    private static boolean[] infected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];
        infected = new boolean[n + 1];
        infected[1] = true;
        count = 0;

        for (int i = 0; i < m; i++) {
            int[] temp = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            arr[temp[0]][temp[1]] = 1;
            arr[temp[1]][temp[0]] = 1;
        }

        dfs(1,  n);
        bw.write(String.valueOf(count));
        bw.close();
    }
    static void dfs(int idx, int n) {
        if (idx > n) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (arr[idx][i] == 1 && !infected[i]) {
                infected[i] = true;
                count++;
                dfs(i, n);
            }
        }
    }
}
