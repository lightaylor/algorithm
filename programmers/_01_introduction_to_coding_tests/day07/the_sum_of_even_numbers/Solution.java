package _01_introduction_to_coding_tests.day07.the_sum_of_even_numbers;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 2 ; i <= n;i ++) {
            answer += i % 2 == 0 ? i : 0;
        }

        return answer;
    }
}
