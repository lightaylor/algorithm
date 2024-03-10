package _01_introduction_to_coding_tests.day19.the_count_of_duplicate_numbers;

import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        for(int i : array) {
            answer += i == n ? 1 : 0;
        }

        return answer;
    }
}
