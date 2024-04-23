package _01_introduction_to_coding_tests.day04.sharing_pizza_2;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= 100; i++) {
            if ((6 * i) % n == 0) return i;
        }

        return answer;
    }
}
