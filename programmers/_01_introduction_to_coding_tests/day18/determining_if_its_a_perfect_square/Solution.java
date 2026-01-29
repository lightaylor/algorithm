package programmers._01_introduction_to_coding_tests.day18.determining_if_its_a_perfect_square;

import java.lang.*;

class Solution {
    public int solution(int n) {
        int answer = n % Math.sqrt(n) == 0 ? 1 : 2;
        return answer;
    }
}
