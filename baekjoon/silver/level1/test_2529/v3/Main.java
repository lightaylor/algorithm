package baekjoon.silver.level1.test_2529.v3;

import java.util.Scanner;

public class Main {

    private static int k;
    private static String[] arrow;
    private static boolean[] number;
    private static int[] arr;
    private static String[] answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = Integer.parseInt(sc.nextLine());
        arrow = sc.nextLine().split(" ");
        number = new boolean[10];
        arr = new int[k + 1];
        answer = new String[2];

        dfs(0);
        System.out.println(answer[1]);
        System.out.println(answer[0]);
    }

    private static void dfs(int idx) {
        if (idx == k + 1) {
            if (isValidate()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i <= k; i++) {
                    sb.append(arr[i]);
                }

                if (answer[0] == null) {
                    answer[0] = sb.toString();
                } else {
                    answer[1] = sb.toString();
                }
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (!number[i]) {
                number[i] = true;
                arr[idx] = i;
                dfs(idx + 1);
                number[i] = false;
            }
        }
    }

    private static boolean isValidate() {
        int idx = 0;

        for (int i = 0; i < k; i++) {
            if (arrow[idx++].equals("<")) {
                if (arr[i] >= arr[i + 1]) {
                    return false;
                }
            } else {
                if (arr[i] <= arr[i + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
