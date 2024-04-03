package _2019_kakao_developer_winter_internship.tuple;

import java.util.*;

public class Solution {
    public int[] solution(String s) {
        s = s.substring(1, s.length() - 2);
        String[] full = s.replace("{", "").split("},");
        int[] answer = new int[full.length];

        Arrays.sort(full, (String s1, String s2) -> s1.length() - s2.length());
        for (int i = 0; i < full.length; i++) {
            String[] inner = full[i].split(",");
            for (int j = 0; j < inner.length; j++) {
                if (checkDup(answer, inner[j])) {
                    answer[i] = Integer.parseInt(inner[j]);
                }
            }
        }

        return answer;
    }

    public boolean checkDup(int[] answer, String str) {
        boolean bool = true;

        for(int i = 0; i < answer.length; i++) {
            if (answer[i] == Integer.parseInt(str)) {
                bool = false;
            }
        }
        return bool;
    }
}