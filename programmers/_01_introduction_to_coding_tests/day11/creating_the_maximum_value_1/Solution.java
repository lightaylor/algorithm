package programmers._01_introduction_to_coding_tests.day11.creating_the_maximum_value_1;

import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        return numbers[numbers.length - 2] * numbers[numbers.length - 1];
    }
}
