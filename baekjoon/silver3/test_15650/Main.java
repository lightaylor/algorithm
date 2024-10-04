package silver3.test_15650;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    private static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        answer = new int[input[1]];
//        go(0, 1, input[0], input[1]);
        go(1, 0, input[0], input[1]);
    }

//    static void go (int idx, int start, int n, int m) {
//        if (idx == m) {
//            for (int i = 0; i < m; i++) {
//                System.out.print(answer[i]);
//                if (i < m - 1) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//            return;
//        }
//
//        for (int i = start; i <= n; i++) {
//            answer[idx] = i;
//            go (idx + 1, i + 1, n, m);
//        }
//    }
    static void go (int idx, int selected, int n, int m) {
        if (selected == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(answer[i]);
                if (i < m - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            return;
        }

        if (idx <= n) {
            answer[selected] = idx;
            go(idx + 1, selected + 1, n, m);
            answer[selected] = 0;
            go(idx + 1, selected, n, m);
        }
    }
}
