package programmers._2022_kakao_tech_internship.personality_test;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        char[] pairs = {'R','T','C','F','J','M','A','N'};
        for (char c : pairs) map.put(c, 0);

        for (int i = 0; i < survey.length; i++)
            addScore(map, survey[i], choices[i]);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pairs.length; i += 2) {
            sb.append(pick(map, pairs[i], pairs[i + 1]));
        }
        return sb.toString();
    }

    private void addScore(Map<Character, Integer> map, String survey, int choice) {
        char left = survey.charAt(0);
        char right = survey.charAt(1);

        switch (choice) {
            case 1 -> map.merge(left, 3, Integer::sum);
            case 2 -> map.merge(left, 2, Integer::sum);
            case 3 -> map.merge(left, 1, Integer::sum);
            case 5 -> map.merge(right, 1, Integer::sum);
            case 6 -> map.merge(right, 2, Integer::sum);
            case 7 -> map.merge(right, 3, Integer::sum);
        }
    }

    private char pick(Map<Character, Integer> map, char left, char right) {
        return map.get(left) >= map.get(right) ? left : right;
    }
}
