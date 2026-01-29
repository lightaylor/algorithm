package programmers._01_introduction_to_coding_tests.day14.uppercase_and_lowercase;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        for(char c : my_string.toCharArray()) {
            answer += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        }

        return answer;
    }
}
