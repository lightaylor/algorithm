package silver.level2.test_11725;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    private static int[] parent;
    private static boolean[] visited;
    private static List<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        parent = new int[n + 1];
        visited = new boolean[n + 1];
        list = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            int[] temp = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list[temp[0]].add(temp[1]);
            list[temp[1]].add(temp[0]);
        }

        DFS(1);
        StringBuilder answer = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            answer.append(parent[i]).append("\n");
        }
        bw.write(answer.toString());
        bw.close();
    }

    private static void DFS (int idx) {
        visited[idx] = true;
        for (int i : list[idx]) {
            if (!visited[i]) {
                parent[i] = idx;
                DFS(i);
            }
        }
    }
}
