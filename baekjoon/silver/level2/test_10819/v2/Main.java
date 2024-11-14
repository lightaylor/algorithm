package silver.level2.test_10819.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    private static int[] NUMBERS;
    private static boolean[] CHECK;
    private static int N;
    private static int MAX;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        NUMBERS = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        CHECK = new boolean[N];

        for (int i = 0; i < N; i++) {
            CHECK[i] = true;
            recursion(1, 0, NUMBERS[i]);
            CHECK[i] = false;
        }
        System.out.print(MAX);
    }

    private static void recursion(int idx, int sum, int prevValue) {
        if (idx == N) {
            MAX = Math.max(MAX, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!CHECK[i]) {
                CHECK[i] = true;
                recursion(idx + 1, sum + Math.abs(prevValue - NUMBERS[i]), NUMBERS[i]);
                CHECK[i] = false;
            }
        }
    }
}
