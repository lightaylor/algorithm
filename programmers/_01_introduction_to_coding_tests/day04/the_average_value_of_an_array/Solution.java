package _01_introduction_to_coding_tests.day04.the_average_value_of_an_array;

import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        double answer = Arrays.stream(numbers).sum();

        return answer / numbers.length;
    }
}
