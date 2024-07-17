package silver3.test_15651;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    private static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        answer = new int[input[1]];
        dfs(0, input[0], input[1]);
    }

    static void dfs (int idx, int n, int m) {
        if (idx == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(answer[i]);
                if (i < m - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            answer[idx] = i;
            dfs(idx + 1, n, m);
        }
    }
}
