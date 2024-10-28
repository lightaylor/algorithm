package _2019_kakao_blind_recruitment.failure_rate;

import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] level = new int[N + 1];
        Map<Integer, Double> percent = new TreeMap<>();

        for (int stage : stages) {
            if (stage <= N) {
                level[stage]++;
            }
        }

        int temp = stages.length;
        for (int i = 1; i <= N; i++) {
            if (temp == 0) {
                percent.put(i, 0.0);
            } else {
                percent.put(i, (double) level[i] / temp);
            }
            temp -= level[i];
        }

        return percent.entrySet().stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
            .mapToInt(Map.Entry::getKey).toArray();
    }
}
