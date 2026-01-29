package baekjoon.silver.level2.test_10819.v3;

import java.util.Scanner;

public class Main {
    private static int N;
    private static int[] arr;
    private static int[] perm;
    private static boolean[] visited;
    private static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        answer = 0;
        visited = new boolean[N];
        arr = new int[N];
        perm = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        generatePermutations(0);
        System.out.print(answer);
    }

    private static void generatePermutations(int idx) {
        if (idx == N) {
            answer = Math.max(answer, calculateSum());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                perm[idx] = arr[i];
                generatePermutations(idx + 1);
                visited[i] = false;
            }
        }
    }

    private static int calculateSum() {
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += Math.abs(perm[i] - perm[i + 1]);
        }
        return sum;
    }
}
