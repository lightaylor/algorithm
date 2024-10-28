package silver.level3.test_15652_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        recursion(1, 0, "");
    }

    private static void recursion(int start, int idx, String answer) {
        if (idx == M) {
            System.out.println(answer.trim());
            return;
        }

        for (int i = start; i <= N; i++) {
                recursion(i, idx + 1, answer + i + " ");
        }
    }
}
