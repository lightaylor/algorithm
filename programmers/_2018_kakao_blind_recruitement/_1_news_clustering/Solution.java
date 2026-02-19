package programmers._2018_kakao_blind_recruitement._1_news_clustering;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int solution(String str1, String str2) {
        int inter = 0;
        int union = 0;

        Map<String, Integer> map1 = make(str1);
        Map<String, Integer> map2 = make(str2);
        Set<String> all = new HashSet<>();
        all.addAll(map1.keySet());
        all.addAll(map2.keySet());

        for (String key : all) {
            int a = map1.getOrDefault(key, 0);
            int b = map2.getOrDefault(key, 0);
            inter += Math.min(a, b);
            union += Math.max(a, b);
        }

        return union == 0 ? 65536 : (int) ((double) inter / union * 65536);
    }

    private Map<String, Integer> make(String s) {
        s = s.toUpperCase();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 1; i++) {
            String sub = s.substring(i, i + 2);
            if (sub.matches("[A-Z]{2}"))
                map.put(sub, map.getOrDefault(sub, 0) + 1);
        }

        return map;
    }
}
