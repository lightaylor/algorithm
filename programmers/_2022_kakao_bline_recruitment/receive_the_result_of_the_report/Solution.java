package _2022_kakao_bline_recruitment.receive_the_result_of_the_report;

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, Integer> bannedCount = new HashMap<>();
        for (String repo : report) {
            String[] split = repo.split(" ");
            String from = split[0];
            String to = split[1];

            reportMap.putIfAbsent(from, new HashSet<>());
            if (reportMap.get(from).add(to)) {
                bannedCount.put(to, bannedCount.getOrDefault(to, 0) + 1);
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            for (String str : reportMap.getOrDefault(user, Collections.emptySet()))
                if (bannedCount.get(str) >= k) answer[i]++;
        }

        return answer;
    }
}
