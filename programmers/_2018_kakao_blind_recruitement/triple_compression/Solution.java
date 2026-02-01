package programmers._2018_kakao_blind_recruitement.triple_compression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> dictionary = new HashMap<>();

        for (int i = 'A'; i <= 'Z'; i++) {
            dictionary.put(String.valueOf((char) i), i - 'A' + 1);
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < msg.length();) {
            String w = "";
            while (i < msg.length() && dictionary.containsKey(w + msg.charAt(i))) {
                w += msg.charAt(i);
                i++;
            }

            answer.add(dictionary.get(w));
            if (i < msg.length()) {
                dictionary.put(w + msg.charAt(i), dictionary.size() + 1);
            }
        }

        return answer.stream().mapToInt(Integer::valueOf).toArray();
    }
}
