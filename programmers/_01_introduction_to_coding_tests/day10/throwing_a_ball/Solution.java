package programmers._01_introduction_to_coding_tests.day10.throwing_a_ball;

class Solution {
    public int solution(int[] numbers, int k) {
        int max = ((k - 1) * 2 - 1) % numbers.length;
        int answer = numbers[max + 1];

        return answer;
    }
}
