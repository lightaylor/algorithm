package _01_introduction_to_coding_tests.day23.ranking;

import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] temp = new double[score.length];
        int j = 0;
        double count;
        Arrays.fill(answer, 1);

        for(int[] i : score) {
            temp[j++] = (double)(i[0] + i[1]) / 2;
        }

        j = 0;
        for(double t : temp) {
            count = t;
            for(double i : temp) {
                if (i > count) answer[j] += 1;
            }
            j++;
        }

        return answer;
    }
}
