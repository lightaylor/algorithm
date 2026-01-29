package programmers.practice_exercise.maximum_and_minimum_values;

import java.util.*;

class Solution {
    public String solution(String s) {
        String[] c = s.split(" ");
        int[] temp = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            temp[i] = Integer.parseInt(c[i]);
        }
        Arrays.sort(temp);
        return temp[0] + " " + temp[temp.length - 1];
    }
}
