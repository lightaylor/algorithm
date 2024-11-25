package silver.level2.test_6603.v3;

import java.util.Scanner;

public class Main {
    private static final int N = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        while (!input.equals("0")) {
            String[] arr = input.split(" ");

            int length = Integer.parseInt(arr[0]);
            int[] lotto = new int[length];
            for (int i = 0; i < length; i++) {
                lotto[i] = Integer.parseInt(arr[i + 1]);
            }

            dfs(0, "", lotto, 0);
            System.out.println();
            input = sc.nextLine();
        }
    }

    private static void dfs(int idx, String result, int[] lotto, int start) {
        if (N == idx) {
            System.out.println(result.trim());
            return;
        }

        for (int i = start; i < lotto.length; i++) {
            dfs(idx + 1, result + lotto[i] + " ", lotto, i + 1);
        }
    }
}
