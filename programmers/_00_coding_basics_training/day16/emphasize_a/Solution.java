package programmers._00_coding_basics_training.day16.emphasize_a;

class Solution {
    public String solution(String myString) {
        String answer = myString.toLowerCase();
        answer = answer.replaceAll("a", "A");
        return answer;
    }
}
