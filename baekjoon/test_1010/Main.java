package baekjoon.test_1010;

import java.util.Scanner;

/*
** 조건 **
- N과 M은 가로지르거나 중복될 수 없다.
- N <= M

** test_1 **
- 2 2: 2
- 1 5: 5
- 13 29: 67863915

** test_2 **
- 2 3: 3
- 2 4: 6
- 2 5: 10

** 추론된 공식 **
- 1:M = M
- N:N = 1
- N:M = 1 + 2 ... (M-N) + (M-N+1)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.nextLine());

        for(int t = 0; t < total; t++) {
            System.out.println(getLegCount(sc.nextLine()));
        }
    }

    public static int getLegCount(String input) {
        String[] str = input.split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int sum = 0;

        if (n == 1) return m;
        else if (n == m) return 1;
        else {
            for (int i = 1; i <= m-n+1; i++) sum+=i;
            return sum;
        }
    }
}
