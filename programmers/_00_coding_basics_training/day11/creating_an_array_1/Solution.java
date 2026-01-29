package programmers._00_coding_basics_training.day11.creating_an_array_1;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for(int i = 1; i <= answer.length; i++) {
            answer[i-1] = k * i;
        }

        return answer;
    }
}
