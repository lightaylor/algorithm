package silver.level3.test_15656.v1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;
    private static int[] NUMBER;
    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        NUMBER = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            NUMBER[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(NUMBER);
        recursion(0, 0, "");
        bw.close();
    }

    private static void recursion(int idx, int start, String answer) throws IOException {
        if (idx == M) {
            bw.write(answer.toString().trim());
            bw.newLine();
            return;
        }

        for (int i = 0; i < N; i++) {
            recursion(idx + 1, i, answer + NUMBER[i] + " ");
        }
    }
}
