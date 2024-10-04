package gold5.test_13549;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[100_001];
        queue.add(new int[]{n, 0});
        visited[n] = true;

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int pos = point[0];
            int move = point[1];

            if (pos == k) {
                bw.write(String.valueOf(move));
                bw.close();
                return;
            }

            int jump = pos * 2;
            if (jump < 100_001 && !visited[jump] && pos < k) {
                visited[jump] = true;
                queue.add(new int[]{jump, move});
            }

            if (pos - 1 >= 0 && pos - 1 < 100_001 && !visited[pos - 1]) {
                visited[pos - 1] = true;
                queue.add(new int[]{pos - 1, move + 1});
            }

            if (pos + 1 >= 0 && pos + 1 < 100_001 && !visited[pos + 1]) {
                visited[pos + 1] = true;
                queue.add(new int[]{pos + 1, move + 1});
            }
        }
    }
}
