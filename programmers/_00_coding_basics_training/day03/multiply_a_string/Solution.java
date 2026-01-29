package programmers.coding_basics_training.day03.multiply_a_string;

class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0;  i < k;  i++) {
            answer = answer + my_string;
        }
        return answer;
    }
}
