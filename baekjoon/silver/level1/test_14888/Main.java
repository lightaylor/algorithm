package silver.level1.test_14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

    private static int N;
    private static int[] number;
    private static int[] operators;
    private static int maxValue;
    private static int minValue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        number = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        operators = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        maxValue = Integer.MIN_VALUE;
        minValue = Integer.MAX_VALUE;

        DFS(number[0], 1);

        System.out.println(maxValue);
        System.out.println(minValue);
    }

    private static void DFS(int start, int idx) {
        if (idx == N) {
            maxValue = Math.max(maxValue, start);
            minValue = Math.min(minValue, start);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                if (i == 0) {
                    DFS(start + number[idx], idx + 1);
                } else if (i == 1) {
                    DFS(start - number[idx], idx + 1);
                } else if (i == 2) {
                    DFS(start * number[idx], idx + 1);
                } else {
                    DFS(divide(start, number[idx]), idx + 1);
                }
                operators[i]++;
            }
        }
    }

    private static int divide (int a, int b) {
        if (a < 0) {
            return -(-a / b);
        } else {
            return a / b;
        }
    }
}
