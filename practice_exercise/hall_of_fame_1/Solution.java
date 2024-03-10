package practice_exercise.hall_of_fame_1;

import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] temp = new int[k];

        for(int i = 0; i < score.length; i++) {
            if (i < k) {
                temp[0] = score[i];
                Arrays.sort(temp);
                answer[i] = temp[k - i - 1];
            } else {
                if (temp[0] < score[i]) {
                    temp[0] = score[i];
                    Arrays.sort(temp);
                }
                answer[i] = temp[0];
            }
        }

        return answer;
    }
}