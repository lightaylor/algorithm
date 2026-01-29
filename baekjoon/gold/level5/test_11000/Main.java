package baekjoon.gold.level5.test_11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] classes = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            classes[i][0] = Integer.parseInt(st.nextToken());
            classes[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(classes, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(classes[0][1]);

        for (int i = 1; i < n; i++) {
            if (classes[i][0] >= pq.peek()) {
                pq.poll();
            }
            pq.add(classes[i][1]);
        }
        System.out.print(pq.size());
    }
}
