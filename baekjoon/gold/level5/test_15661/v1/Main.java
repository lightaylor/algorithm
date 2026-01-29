package baekjoon.gold.level5.test_15661.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    private static int N;
    private static int MIN;
    private static boolean[] CHECK;
    private static int[][] TEAM;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        TEAM = new int[N][];
        CHECK = new boolean[N];
        MIN = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            TEAM[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        recursion(0, 0);
        System.out.print(MIN);
    }

    private static void recursion(int idx, int start) {
        if (idx > 0) {
            scoreCalculator();
        }

        for (int i = start; i < N; i++) {
            CHECK[i] = true;
            recursion(idx + 1, i + 1);
            CHECK[i] = false;
        }
    }

    private static void scoreCalculator() {
        int startCount = 0;
        int linkCount = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (CHECK[i] && CHECK[j]) {
                    startCount += TEAM[i][j] + TEAM[j][i];
                } else if (!CHECK[i] && !CHECK[j]) {
                    linkCount += TEAM[i][j] + TEAM[j][i];
                }
            }
        }

        if (startCount > 0 && linkCount > 0) {
            MIN = Math.min(MIN, Math.abs(startCount - linkCount));
        }
    }
}
