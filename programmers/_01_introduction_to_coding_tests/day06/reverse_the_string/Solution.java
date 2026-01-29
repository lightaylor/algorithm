package programmers._01_introduction_to_coding_tests.day06.reverse_the_string;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        for(int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }

        return answer;
    }
}
