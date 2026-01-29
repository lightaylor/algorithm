package programmers._00_coding_basics_training.day13.elements_with_an_interval_of_n;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[((num_list.length - 1) / n) + 1];

        int j = 0;
        for(int i = 0; i < answer.length; i++) {
            answer[j++] = num_list[i*n];
        }

        return answer;
    }
}
