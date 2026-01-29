package baekjoon.bronze.level3.test_22938;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long x1 = Long.parseLong(st.nextToken());
        long y1 = Long.parseLong(st.nextToken());
        long r1 = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long x2 = Long.parseLong(st.nextToken());
        long y2 = Long.parseLong(st.nextToken());
        long r2 = Long.parseLong(st.nextToken());

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (d < r1 + r2) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
