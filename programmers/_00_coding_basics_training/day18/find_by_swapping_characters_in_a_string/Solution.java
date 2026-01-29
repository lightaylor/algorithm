package programmers._00_coding_basics_training.day18.find_by_swapping_characters_in_a_string;

class Solution {
    public int solution(String myString, String pat) {
        String answer = myString;
        answer = answer.replace('A', '-');
        answer = answer.replace('B', 'A');
        answer = answer.replace('-', 'B');

        return answer.contains(pat) ? 1 : 0;
    }
}
