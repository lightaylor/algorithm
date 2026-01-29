package programmers._01_introduction_to_coding_tests.day18.bacterial_proliferation;

class Solution {
    public int solution(int n, int t) {
        int answer = n;

        for(int i = 1; i <= t; i++) {
            answer *= 2;
        }

        return answer;
    }
}
