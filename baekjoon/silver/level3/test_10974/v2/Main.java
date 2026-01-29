package baekjoon.silver.level3.test_10974.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static boolean[] CHECK;
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        CHECK = new boolean[N + 1];

        recursion(0, "");
    }

    private static void recursion(int idx, String answer) {
        if (idx == N) {
            System.out.println(answer.trim());
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!CHECK[i]) {
                CHECK[i] = true;
                recursion(idx + 1, answer + i + " ");
                CHECK[i] = false;
            }
        }
    }
}
