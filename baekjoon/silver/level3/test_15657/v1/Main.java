package silver.level3.test_15657.v1;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    private static BufferedWriter bw;
    private static int[] answer;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nm = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        answer = new int[nm[1]];
        Arrays.sort(arr);
        dfs(0, 0, nm[0], nm[1]);
        bw.close();
    }
    static void dfs(int idx, int start, int n, int m) throws IOException {
        if (idx == m) {
            for (int i = 0; i < answer.length; i++) {
                bw.write(String.valueOf(answer[i]));
                if (i < answer.length - 1) {
                    bw.write(" ");
                }
            }
            bw.newLine();
            return;
        }

        for (int i = start; i < n; i++) {
            answer[idx] = arr[i];
            dfs(idx + 1, i, n, m);
        }
    }
}
