package silver.level2.test_15663_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;
    private static int[] NUMBERS;
    private static boolean[] CHECK;
    private static Set<String> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        set = new LinkedHashSet<>();

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

        for (String number : set) {
            System.out.println(number);
        }
    }

    private static void recursion(int idx, int start, String answer) {
        if (idx == M) {
            set.add(answer.trim());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!CHECK[i]) {
                CHECK[i] = true;
                recursion(idx + 1, start + 1, answer + NUMBERS[i] + " ");
                CHECK[i] = false;
            }
        }
    }
}
