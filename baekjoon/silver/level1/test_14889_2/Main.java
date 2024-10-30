package silver.level1.test_14889_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    private static int N;
    private static int MIN;
    private static int[][] TEAM;
    private static boolean[] CHECK;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        CHECK = new boolean[N];
        MIN = Integer.MAX_VALUE;
        TEAM = new int[N][];

        for (int i = 0; i < N; i++) {
            TEAM[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        recursion(0, 0);
        System.out.print(MIN);
    }

    private static void recursion(int idx, int start) {
        if (idx == N / 2) {
            MIN = Math.min(sumPower(), MIN);
            return;
        }

        for (int i = start; i < N; i++) {
            CHECK[i] = true;
            recursion(idx + 1, i + 1);
            CHECK[i] = false;
        }
    }

    private static int sumPower() {
        int startSum = 0;
        int linkSum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (CHECK[i] && CHECK[j]) {
                    startSum += TEAM[i][j] + TEAM[j][i];
                } else if (!CHECK[i] && !CHECK[j]) {
                    linkSum += TEAM[i][j] + TEAM[j][i];
                }
            }
        }

        return Math.abs(startSum - linkSum);
    }
}
