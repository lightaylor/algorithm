package silver.level3.test_15652;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    private static int[] answer;
    private static StringBuffer sb;
    private static int[] count = new int[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuffer();

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        answer = new int[input[1]];
//        dfs(0, 1, input[0], input[1]);
        go(1, 0, input[0], input[1]);
        System.out.print(sb);
    }

//    static void dfs(int idx, int start, int n, int m) {
//        if (idx == m) {
//            for (int i = 0; i < m; i++) {
//                sb.append(answer[i]);
//                if (i < m - 1) {
//                    sb.append(" ");
//                }
//            }
//            sb.append("\n");
//            return;
//        }
//
//        for (int i = start; i <= n; i++) {
//            answer[idx] = i;
//            dfs(idx + 1, i, n, m);
//        }
//    }

    // index = 숫자, selected = 선택한 수의 총 개수 (최대 m개 까지 선택가능)
    static void go (int index, int selected, int n, int m) {
        if (selected == m) {
            StringBuilder temp = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= count[i]; j++) {
                    temp.append(i);
                    if (temp.length() < 2 * m - 1) {
                       temp.append(" ");
                    }
               }
           }
           sb.append(temp).append("\n");
           return;
        }

        if (index > n) return;
        // m - 1 번까지
        for (int i = m - selected; i > 0; i--) {
            // 숫자(index)를 총 i 개 가진다.
            count[index] = i;
            go(index + 1, selected + i, n, m);
        }

        // index = 0 으로 선택하지 않았기 때문에 selected 추가하지 않음
        count[index] = 0;
        go(index + 1, selected, n, m);
    }
}
