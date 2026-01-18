package _2023_kakao_blind_recruitement.personal_information_retention_period;

import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        for (String term : terms) {
            String[] s = term.split(" ");
            map.put(s[0], Integer.parseInt(s[1]));
        }

        int todaySum = toDays(today);
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            int expire = toDays(privacy[0]) + map.get(privacy[1]) * 28 - 1;

            if (expire < todaySum) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private int toDays(String date) {
        String[] s = date.split("\\.");
        int y = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int d = Integer.parseInt(s[2]);
        return y * 12 * 28 + m * 28 + d;
    }
}
