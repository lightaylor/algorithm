package programmers._01_introduction_to_coding_tests.day06.print_repeated_characters;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for(char str : my_string.toCharArray()) {
            answer += String.valueOf(str).repeat(n);
        }

        return answer;
    }
}
