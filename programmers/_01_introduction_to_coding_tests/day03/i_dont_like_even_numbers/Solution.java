package programmers._01_introduction_to_coding_tests.day03.i_dont_like_even_numbers;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n%2 == 0 ? n/2 : n/2+1];
        int j = 0;

        for(int i = 1; i <= n; i+=2) {
            answer[j++] = i;
        }

        return answer;
    }
}
