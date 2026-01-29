package baekjoon.silver.level5.test_1476.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int e = 1;
        int s = 1;
        int m = 1;

        int eMax = 15;
        int sMax = 28;
        int mMax = 19;

        int answer = 1;
        while (E != e || S != s || M != m) {
            ++e;
            ++s;
            ++m;

            if (e > eMax) {
                e = 1;
            }

            if (s > sMax) {
                s = 1;
            }

            if (m > mMax) {
                m = 1;
            }

            answer++;
        }

        System.out.print(answer);
    }
}
