package _01_introduction_to_coding_tests.day04.sharing_pizza_1;

class Solution {
    public int solution(int n) {
        int answer = n % 7 == 0 ? n / 7 : n / 7 + 1;
        return answer;
    }
}
