package silver2.test_1260;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < input[1]; i++) {
            int[] arrow = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (map.containsKey(arrow[0])) {
                map.get(arrow[0]).add(arrow[1]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(arrow[1]);
                map.put(arrow[0], list);
            }

            if (map.containsKey(arrow[1])) {
                map.get(arrow[1]).add(arrow[0]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(arrow[0]);
                map.put(arrow[1], list);
            }
        }

        bw.write(dfs(input, map));
        bw.newLine();
        bw.write(bfs(input, map));
        bw.close();
    }
    static public String dfs (int[] input, Map<Integer, List<Integer>> map) {
        boolean[] visit = new boolean[10_001];
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        stack.add(input[2]);

        while (!stack.isEmpty()) {
            int idx = stack.pop();
            if (!visit[idx]) visit[idx] = true;
            result.append(idx);

            Collections.sort(map.get(idx));
            for (int i : map.get(idx)) {
                if (!visit[i]) {
                    stack.add(i);
                }
            }

            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    static public String bfs (int[] input,  Map<Integer, List<Integer>> map) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visit = new boolean[10_001];
        StringBuilder result = new StringBuilder();

        queue.add(input[2]);
        visit[input[2]] = true;
        while (!queue.isEmpty()) {
            int idx = queue.poll();
            result.append(idx);

            Collections.sort(map.get(idx));
            for (int i : map.get(idx)) {
                if (!visit[i]) {
                    visit[i] = true;
                    queue.add(i);
                }
            }

            if (!queue.isEmpty()) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
