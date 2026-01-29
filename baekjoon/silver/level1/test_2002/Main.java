package baekjoon.silver.level1.test_2002;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, Integer> inMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            inMap.put(sc.nextLine(), i);
        }

        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            out[i] = inMap.get(sc.nextLine());
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (out[i] > out[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.print(count);
    }
}
