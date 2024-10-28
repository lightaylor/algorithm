package silver.level3.test_15651_2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int M;
    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        recursion(0, "");
        bw.close();
    }

    private static void recursion(int idx, String answer) throws IOException {
        if (idx == M) {
            bw.write(answer.trim());
            bw.newLine();
            return;
        }

        for (int i = 1; i <= N; i++) {
            recursion(idx + 1, answer + i + " ");
        }
    }
}
