package gold.level5.test_1107.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    private static boolean[] BROKEN;
    private static final int START = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int M = Integer.parseInt(br.readLine());
        int answer = Math.abs(N - START);
        if (M == 10) {
            System.out.print(answer);
            return;
        }

        BROKEN = new boolean[10];
        if (M > 0) {
            int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i : input) {
                BROKEN[i] = true;
            }
        }

        for (int i = 0; i < 1_000_000; i++) {
            if (possible(i)) {
                int count = Math.abs(N - i) + String.valueOf(i).length();
                answer = Math.min(answer, count);
            }
        }

        System.out.print(answer);
    }

    private static boolean possible(int number) {
        if(number == 0) {
            return !BROKEN[0];
        }

        while (number > 0) {
            int remained = number % 10;
            number /= 10;

            if (BROKEN[remained]) {
                return false;
            }
        }

        return true;
    }
}
