package programmers._01_introduction_to_coding_tests.day17.find_the_number;

class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        int answer = str.indexOf(String.valueOf(k));

        return answer != -1 ? answer + 1 : answer;
    }
}
