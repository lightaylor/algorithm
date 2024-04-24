package baekjoon.test_19587;

import java.util.Scanner;

/*
** 조건 **
- 한 층은 두 개의 객실을 가질 수 있다. > 한 층이 가질 수 있는 경우의 수 = 3 (0, 1, 2)
- 인접한 층은 (위층은) 0보다 큰 중복된 숫자를 가질 수 없다.

** case **
- 1: 1 + (1 * 2) = 3
- 2: 3 + (2 * 2) = 7
- 3: 7 + (5 * 2) = 17
- 4: 17 + (12 * 2) = 41
- 5: 41 + (29 * 2) = 99
  n: A + B

** 추론된 공식 **
X[n] = (dp[n-1] * 2) + dp[n-2]

A = X[n]
B = X[n] * 2

dp[n] = A + B
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] dp = {1, 2, 3};
        long temp = 0;

        for(int i = 1; i < n; i++) {
            temp = dp[2];
            dp[2] = (dp[1] * 2 + dp[0]);
            dp[0] = dp[1];
            dp[1] = temp;
        }

        dp[2] = (dp[2] * 2 + dp[1]) % 1000000007;
        System.out.print(dp[2]);
    }
}
