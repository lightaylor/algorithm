package programmers._00_coding_basics_training.day12.the_first_occurrence_of_a_negative_number;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return answer;
            }
            answer += 1;
        }

        return -1;
    }
}
