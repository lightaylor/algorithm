package programmers._00_coding_basics_training.day23.find_the_integer;

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;

        for(int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                return 1;
            }
        }

        return answer;
    }
}
