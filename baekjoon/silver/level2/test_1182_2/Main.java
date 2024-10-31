package silver.level2.test_1182_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    private static int N;
    private static int S;
    private static int[] NUMBER;
    private static boolean[] CHECK;
    private static int COUNT = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        NUMBER = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        CHECK = new boolean[N];

        recursion(0, 0);
        System.out.print(COUNT);
    }

    private static void recursion(int idx, int start) {
        if (idx  > 0 && isValid()) {
            COUNT++;
        }

        for (int i = start; i < N; i++) {
            CHECK[i] = true;
            recursion(idx + 1, i + 1);
            CHECK[i] = false;
        }
    }

    private static boolean isValid() {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            if (CHECK[i]) {
                sum += NUMBER[i];
            }
        }

        return sum == S;
    }
}
