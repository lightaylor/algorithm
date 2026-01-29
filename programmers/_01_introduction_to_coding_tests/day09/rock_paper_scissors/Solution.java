package programmers._01_introduction_to_coding_tests.day09.rock_paper_scissors;

class Solution {
    public String solution(String rsp) {
        String answer = "";

        for(char s : rsp.toCharArray()) {
            answer += s == '2' ? "0" : "";
            answer += s == '0' ? "5" : "";
            answer += s == '5' ? "2" : "";
        }

        return answer;
    }
}
