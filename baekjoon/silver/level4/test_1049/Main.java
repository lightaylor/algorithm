package baekjoon.silver.level4.test_1049;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int minPackagePrice = Integer.MAX_VALUE;
        int minRopePrice = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int packagePrice = Integer.parseInt(st.nextToken());
            int ropePrice = Integer.parseInt(st.nextToken());

            minPackagePrice = Math.min(minPackagePrice, packagePrice);
            minRopePrice = Math.min(minRopePrice, ropePrice);
        }

        int totalPackagePrice = (N / 6) * minPackagePrice + Math.min(minPackagePrice, (N % 6) * minRopePrice);
        int totalRopePrice = N * minRopePrice;
        int answer = Math.min(totalPackagePrice, totalRopePrice);

        System.out.print(answer);
    }
}
