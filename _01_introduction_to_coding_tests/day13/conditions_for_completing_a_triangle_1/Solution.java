package _01_introduction_to_coding_tests.day13.conditions_for_completing_a_triangle_1;

import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);

        return sides[0] + sides[1] > sides[2] ? 1 :2;
    }
}
