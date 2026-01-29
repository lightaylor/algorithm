package programmers._2018_kakao_blind_recruitement.round1_dartgame;

import java.util.Arrays;

class Solution {
    public int solution(String dartResult) {
        int index = 0;
        int[] scores = new int[3];

        for (int i = 0; i < 3; i++) {
            scores[i] = dartResult.charAt(index++) - '0';
            if (Character.isDigit(dartResult.charAt(index)))
                scores[i] = scores[i] * 10 + (dartResult.charAt(index++) - '0');

            switch (dartResult.charAt(index++)) {
                case 'S':
                    break;
                case 'D':
                    scores[i] = (int) Math.pow(scores[i], 2);
                    break;
                case 'T':
                    scores[i] = (int) Math.pow(scores[i], 3);
                    break;
            }

            if (index < dartResult.length() && (dartResult.charAt(index) == '*' || dartResult.charAt(index) == '#')) {
                switch (dartResult.charAt(index++)) {
                    case '*':
                        scores[i] *= 2;
                        if (i > 0) scores[i - 1] *= 2;
                        break;
                    case '#':
                        scores[i] *= -1;
                        break;
                }
            }
        }
        return Arrays.stream(scores).sum();
    }
}
