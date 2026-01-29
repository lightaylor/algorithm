package baekjoon.silver.level2.test_10971.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    private static int N;
    private static long[][] TRIP;
    private static boolean[] CHECK;
    private static long MIN;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        CHECK = new boolean[N];
        TRIP = new long[N][];
        MIN = Long.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            TRIP[i] = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        }

        recursion(1, 0, 0);
        System.out.print(MIN);
    }

    private static void recursion(long idx, long sum, int prev) {
        if (idx == N) {
            if (TRIP[prev][0] > 0) {
                MIN = Math.min(MIN, sum + TRIP[prev][0]);
            }

            return;
        }

        for (int i = 1; i < N; i++) {
            if (!CHECK[i] && prev != i && TRIP[prev][i] > 0) {
                CHECK[i] = true;
                recursion(idx + 1, sum + TRIP[prev][i], i);
                CHECK[i] = false;
            }
        }
    }
}
