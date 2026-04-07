package programmers.practice_exercise.best_set;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int s) {

        if (s < n) return new int[]{-1};

        int[] answer = new int[n];
        Arrays.fill(answer, s / n);
        for (int i = n - 1; i >= n - (s % n); i--) answer[i]++;

        return answer;
    }
}
