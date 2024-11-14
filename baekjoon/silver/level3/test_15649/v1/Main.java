package silver.level3.test_15649.v1;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    private static final boolean[] check = new boolean[10];
    private static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        answer = new int[input[1]];
        go(0, input[0], input[1]);
    }

    static void go(int index, int n, int m) {
        if (index == m) {
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
            if (check[i]) {
                continue;
            }
            check[i] = true;
            answer[index] = i;
            go(index + 1, n, m);
            check[i] = false;
        }
    }
}
