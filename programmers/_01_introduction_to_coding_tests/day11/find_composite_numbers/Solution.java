package programmers._01_introduction_to_coding_tests.day11.find_composite_numbers;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 4; i <= n; i++) {
            int num = 1;
            for(int j = 2; j <= i; j++) {
                if (i % j == 0) num++;
            }
            if (num > 2) answer++;
        }

        return answer;
    }
}
