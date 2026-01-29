package baekjoon.silver.level4.test_2776;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int m1 = Integer.parseInt(sc.nextLine());
            int[] m1Arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Set<Integer> set = new HashSet<>(m1Arr.length);
            for (int num : m1Arr) set.add(num);

            int m2 = Integer.parseInt(sc.nextLine());
            int[] m2Arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int j : m2Arr) {
                sb.append(set.contains(j) ? 1 : 0).append("\n");
            }
        }
        System.out.print(sb);
    }
}
