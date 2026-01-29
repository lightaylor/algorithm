package programmers.programmers.practice_exercise.long_jump;

class Solution {
    public long solution(int n) {
        long[] dp = {0, 1, 1};

        for (int i = 1; i < n; i++) {
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = (dp[0] + dp[1]) % 1234567;
        }

        return dp[2];
    }
}
