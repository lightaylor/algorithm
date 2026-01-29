package programmers._01_introduction_to_coding_tests.day03.find_the_median;

import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
