package baekjoon.gold.level2.test_1202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        long[][] jewels = new long[N][2];
        long[] bags = new long[K];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            jewels[i][0] = Long.parseLong(st.nextToken());
            jewels[i][1] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(jewels, (a, b) -> {
            if (a[0] == b[0]) return Math.toIntExact(a[1] - b[1]);
            else return Math.toIntExact(a[0] - b[0]);
        });

        for (int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(bags);

        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        long answer = 0;
        int j = 0;

        for (int i = 0; i < K; i++) {
            while (j < N && jewels[j][0] <= bags[i]) {
                pq.offer(jewels[j][1]);
                j++;
            }
            if (!pq.isEmpty()) {
                answer += pq.poll();
            }
        }

        System.out.print(answer);
    }
}
