package programmers._01_introduction_to_coding_tests.day05.iced_americano;

class Solution {
    public int[] solution(int money) {
        int[] answer = {money/5500, money%5500};
        return answer;
    }
}
