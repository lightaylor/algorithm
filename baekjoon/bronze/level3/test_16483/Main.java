package baekjoon.bronze.level3.test_16483;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float T = sc.nextInt();
        float answer = Math.round(Math.pow(T, 2)/4);
        System.out.print((int) answer);
    }
}
