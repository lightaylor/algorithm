package _00_coding_basics_training.day06.manipulating_numbers_1;

class Solution {
    public int solution(int n, String control) {
        int answer = n;

        for(int i = 0; i < control.length(); i++) {
            answer += control.charAt(i) == 'w' ? 1 : 0;
            answer -= control.charAt(i) == 's' ? 1 : 0;
            answer += control.charAt(i) == 'd' ? 10 : 0;
            answer -= control.charAt(i) == 'a' ? 10 : 0;
        }

        return answer;
    }
}
