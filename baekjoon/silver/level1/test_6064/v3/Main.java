package silver.level1.test_6064.v3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            int answer = -1;
            for (int j = 0; j < 40_000; j++) {
                int k = M * j + x;
                if (k % N == y) {
                    answer = k + 1;
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
