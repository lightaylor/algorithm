package programmers._00_coding_basics_training.day15.find_the_desired_string;

class Solution {
    public int solution(String myString, String pat) {
        String answer = myString.toUpperCase();
        return answer.contains(pat.toUpperCase()) ? 1 : 0;
    }
}
