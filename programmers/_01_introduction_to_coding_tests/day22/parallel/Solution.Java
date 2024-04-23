package _01_introduction_to_coding_tests.day22.parallel;

import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots, (o1, o2) -> {
            return o1[0]-o2[0];
        });

        int AlineX = absValue(dots[0][0], dots[2][0]);
        int AlineY = absValue(dots[0][1], dots[2][1]);

        int BlineX = absValue(dots[1][0], dots[3][0]);
        int BlineY = absValue(dots[1][1], dots[3][1]);

        if (AlineX - BlineX == AlineY - BlineY) {
            return 1;
        }

        return 0;
    }

    private int absValue(int a, int b) {
        return Math.abs(a - b);
    }
}
