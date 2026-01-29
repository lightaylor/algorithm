package baekjoon.silver.level3.test_15655.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;
    private static int[] NUMBERS;
    private static boolean[] CHECK;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        NUMBERS = new int[N];
        CHECK = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            NUMBERS[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(NUMBERS);
        recursion(0, 0, "");
    }

    private static void recursion(int start, int idx, String answer) {
        if (idx == M) {
            System.out.println(answer.trim());
            return;
        }

        for (int i = start; i < N; i++) {
            if (!CHECK[i]) {
                CHECK[i] = true;
                recursion(i + 1, idx + 1, answer + NUMBERS[i] + " ");
                CHECK[i] = false;
            }
        }
    }
}
