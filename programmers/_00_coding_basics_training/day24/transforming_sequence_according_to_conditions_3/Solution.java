package programmers._00_coding_basics_training.day24.transforming_sequence_according_to_conditions_3;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = arr;

        for(int i = 0; i < arr.length; i++) {
            answer[i] = k % 2 == 0 ? answer[i] + k : answer[i] * k;
        }

        return answer;
    }
}
