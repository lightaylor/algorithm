package baekjoon.bronze.level4.test_21335.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        double answer = 2 * Math.PI * Math.sqrt(n / Math.PI);
        System.out.printf("%.9f", answer);
    }
}
