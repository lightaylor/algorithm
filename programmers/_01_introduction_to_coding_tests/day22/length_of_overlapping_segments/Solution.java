package _01_introduction_to_coding_tests.day22.length_of_overlapping_segments;

import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        Arrays.sort(lines, (o1, o2) -> { return o1[0]-o2[0]; });
        return checkLine(lines[0], lines[1], lines[2]);
    }

    private int checkLine(int[] a, int[] b, int[] c) {
        boolean[] overlapLine = new boolean[200];
        int count = 0;
        int max = 0;

        if (a[0] <= b[0] && b[0] < a[1]) {
            max = a[1] < b[1] ? a[1] : b[1];
            for (int i = b[0]; i < max; i++) {
                overlapLine[i + 100] = true;
            }
        }

        if (b[0] <= c[0] && c[0] < b[1]) {
            max = b[1] < c[1] ? b[1] : c[1];
            for (int i = c[0]; i < max; i++) {
                overlapLine[i + 100] = true;
            }
        }

        if (a[0] <= c[0] && c[0] < a[1] ) {
            max = a[1] < c[1] ? a[1] : c[1];
            for (int i = c[0]; i < max; i++) {
                overlapLine[i + 100] = true;
            }
        }

        for (int i = 0; i < overlapLine.length; i++) {
            count += overlapLine[i] ? 1 : 0;
        }

        return count;
    }
}