package programmers.practice_exercise.sum_of_digits;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] c = String.valueOf(n).toCharArray();

        for (int i = 0; i < c.length; i++) {
            answer += Character.getNumericValue(c[i]);
        }

        return answer;
    }
}
