package silver3.test_15654;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    private static BufferedWriter bw;
    private static int[] answer;
    private static int[] arr;
    private static boolean[] checked;

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        answer = new int[input[0]];
        checked = new boolean[input[0]];
        Arrays.sort(arr);

        dfs(0, input[0], input[1]);
        bw.close();
    }

    static void dfs(int idx, int n, int m) throws IOException {
        if (idx == m) {
            for (int i = 0; i < m; i++) {
                bw.write(String.valueOf(answer[i]));
                if (i < m - 1) {
                    bw.write(" ");
                }
            }
            bw.newLine();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!checked[i]){
                answer[idx] = arr[i];
                checked[i] = true;
                dfs(idx + 1, n, m);
                checked[i] = false;
            }
        }
    }
}
