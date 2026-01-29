package baekjoon.silver.level5.test_2828;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int j = sc.nextInt();

        int p = 1;
        int answer = 0;
        for (int i = 0; i < j; i++) {
            int apple = sc.nextInt();
            if (apple < p) {
                answer += (p - apple);
                p = apple;
            } else if (apple > p + m - 1) {
                answer += (apple - (p + m - 1));
                p = apple - m + 1;
            }
        }
        System.out.print(answer);
    }
}
