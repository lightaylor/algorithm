package baekjoon.bronze.level3.test_3034;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            int match = Integer.parseInt(br.readLine());
            int maxH = (int) Math.sqrt(W * W + H * H);

            if (match <= maxH) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
