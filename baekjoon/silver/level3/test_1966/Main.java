package silver.level3.test_1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            Queue<int[]> queue = new LinkedList<>();
            for (int j = 0; j < a; j++) {
                queue.add(new int[]{j, arr[j]});
            }

            int order = 0;
            while (!queue.isEmpty()) {
                int[] q = queue.remove();
                boolean check = false;

                for (int[] j : queue) {
                    if (j[1] > q[1]) {
                        check = true;
                        break;
                    }
                }

                if (check) {
                    queue.offer(q);
                } else {
                    order += 1;
                    if (q[0] == b) {
                        System.out.println(order);
                        break;
                    }
                }
            }
        }
    }
}
