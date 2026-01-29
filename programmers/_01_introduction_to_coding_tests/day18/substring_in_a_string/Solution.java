package programmers._01_introduction_to_coding_tests.day18.substring_in_a_string;

class Solution {
    public int solution(String str1, String str2) {
        int answer = str1.contains(str2) ? 1 : 2;
        return answer;
    }
}
