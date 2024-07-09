package silver3.test_2346;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        Deque<int[]> deque = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (String str : arr) {
            deque.add(new int[]{Integer.parseInt(str), count++});
        }

        int[] idx = deque.pollFirst();
        result.append(idx[1]);

        while (!deque.isEmpty()) {
            result.append(" ");

            if (idx[0] > 0) {
                for (int j = 1; j < idx[0]; j++) {
                    deque.add(deque.pollFirst());
                }
                idx = deque.pollFirst();
            } else {
                for (int j = idx[0] + 1; j < 0; j++) {
                    deque.addFirst(deque.pollLast());
                }
                idx = deque.pollLast();
            }
            result.append(idx[1]);
        }

        bw.write(result.toString());
        bw.close();
    }
}
