package programmers._00_coding_basics_training.day21.sum_of_string_integers;

class Solution {
    public int solution(String num_str) {
        int answer = 0;

        for(int i = 0; i < num_str.length(); i++) {
            answer += (num_str.charAt(i) - '0');
        }

        return answer;
    }
}
