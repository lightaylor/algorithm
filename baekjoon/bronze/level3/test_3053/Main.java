package baekjoon.bronze.level3.test_3053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        double euclideanArea = a * a * Math.PI;
        double taxiArea = a * a * 2;

        System.out.printf("%.6f\n", euclideanArea);
        System.out.printf("%.6f\n", taxiArea);
    }
}
