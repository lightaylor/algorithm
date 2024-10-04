package gold.level3.test_16940;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer>[] list = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            list[a].add(b);
            list[b].add(a);
        }

        int[] order = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] check = new boolean[n];
        int[] parent = new int[n];
        queue.add(0);
        check[0] = true;
        String answer = "1";
        int m = 1;
        for (int i = 0; i < n; i++) {
            if (queue.isEmpty()) {
                answer = "0";
                break;
            }
            int x = queue.remove();
            if (x != order[i] - 1) {
                answer = "0";
                break;
            }
            int cnt = 0;
            for (int y : list[x]) {
                if (!check[y]) {
                    parent[y] = x;
                    cnt += 1;
                }
            }
            for (int j = 0; j < cnt; j++) {
                if (m + j >= n || parent[order[m + j] - 1] != x) {
                    answer = "0";
                    break;
                }
                queue.add(order[m + j] - 1);
                check[order[m + j] - 1] = true;
            }
            m += cnt;
        }
        bw.write(answer);
        bw.close();
    }
}
