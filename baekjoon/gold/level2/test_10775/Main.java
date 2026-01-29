package baekjoon.gold.level2.test_10775;

import java.util.Scanner;

public class Main {
    private static int[] gates;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int p = sc.nextInt();

        gates = new int[g + 1];
        for (int i = 1; i <= g; i++) {
            gates[i] = i;
        }

        int count = 0;
        for (int i = 0; i < p; i++) {
            int plane = sc.nextInt();
            int availableGate = find(plane);

            if (availableGate == 0) break;

            union(availableGate, availableGate - 1);
            count++;
        }

        System.out.print(count);
    }

    private static int find(int plane) {
        if (gates[plane] == plane) return plane;
        return gates[plane] = find(gates[plane]);
    }

    private static void union(int a, int b) {
        gates[a] = b;
    }
}
