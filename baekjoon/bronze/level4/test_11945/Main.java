package baekjoon.bronze.level4.test_11945;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr[0]; i++) {
            sb.setLength(0);
            sb.append(sc.nextLine()).reverse();
            System.out.println(sb);
        }
    }
}
