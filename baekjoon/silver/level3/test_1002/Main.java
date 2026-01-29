package baekjoon.silver.level3.test_1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] jo = new int[3];
        int[] back = new int[3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            jo[0] = Integer.parseInt(st.nextToken());
            jo[1] = Integer.parseInt(st.nextToken());
            jo[2] = Integer.parseInt(st.nextToken());

            back[0] = Integer.parseInt(st.nextToken());
            back[1] = Integer.parseInt(st.nextToken());
            back[2] = Integer.parseInt(st.nextToken());

            int d = (int) (Math.pow((jo[0] - back[0]), 2) + Math.pow((jo[1] - back[1]), 2));
            int rSum = (int) Math.pow(jo[2] + back[2], 2);
            int rDiff = (int) Math.pow(jo[2] - back[2], 2);

            int answer = 2;
            if (back[2] == jo[2] && d == 0) {
                answer = -1;
            } else if (d > rSum || d < rDiff) {
                answer = 0;
            } else if (d == rSum || d == rDiff) {
                answer = 1;
            }

            System.out.println(answer);
        }
    }
}
