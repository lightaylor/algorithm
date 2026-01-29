package programmers._01_introduction_to_coding_tests.day14.closest_number;

import java.lang.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];

        for(int i : array) {
            if(Math.abs(i - n) < Math.abs(answer - n)) {
                answer = i;
            } else if(Math.abs(i - n) == Math.abs(answer - n)) {
                answer = i > answer ? answer : i;
            }
        }

        return answer;
    }
}
