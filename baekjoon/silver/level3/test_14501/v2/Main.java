package baekjoon.silver.level3.test_14501.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int MAX;
    private static int N;
    private static int[][] WORKS;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        MAX = 0;
        WORKS = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            WORKS[i][0] = Integer.parseInt(st.nextToken());
            WORKS[i][1] = Integer.parseInt(st.nextToken());
        }

        recursion(0, 0);
        System.out.print(MAX);
    }

    private static void recursion(int start, int sum) {
        if (start >= N) {
            MAX = Math.max(sum, MAX);
            return;
        }

        for (int i = start; i < N; i++) {
            if (WORKS[i][0] + i > N) {
                recursion(i + WORKS[i][0], sum);
            } else {
                recursion(i + WORKS[i][0], sum + WORKS[i][1]);
            }
        }
    }
}
