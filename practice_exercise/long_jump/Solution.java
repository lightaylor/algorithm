package practice_exercise.long_jump;

class Solution {
    public long solution(int n) {
        long answer = 0;

        for (int i = 1; i <= n; i++) {
            answer += jump(n, i);
        }

        return answer % 1234567;
    }

    public int jump(int n, int sum) {
        int count = 0;
        int remain = n - sum;

        if (remain == 0) return 1;
        else if (remain < 0) return 0;

        for (int i = 1; i <= 2; i++) {
            count += jump(n, sum + i);
        }

        return count;
    }
}