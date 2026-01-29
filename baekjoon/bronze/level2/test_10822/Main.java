package baekjoon.bronze.level2.test_10822;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] split = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < split.length; i++) sum += split[i];
        System.out.print(sum);
    }
}
