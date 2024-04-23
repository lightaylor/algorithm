package _00_coding_basics_training.day22.check_if_it_is_a_substring;

class Solution {
    public int solution(String my_string, String target) {
        int answer = my_string.contains(target) ? 1 : 0;
        return answer;
    }
}
