package practice_exercise.number_of_consecutive_subsequence_sums;

import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> list = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (int j = i; j < i + elements.length; j++) {
                sum += elements.length > j ? elements[j] : elements[j - elements.length];
                list.add(sum);
            }
        }
        return list.size();
    }
}