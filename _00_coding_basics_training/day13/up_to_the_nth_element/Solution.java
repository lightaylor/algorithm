package _00_coding_basics_training.day13.up_to_the_nth_element;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for(int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}
