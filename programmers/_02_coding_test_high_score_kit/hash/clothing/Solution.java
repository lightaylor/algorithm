package programmers._02_coding_test_high_score_kit.hash.clothing;

import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(String[] key : clothes) {
            if(!map.containsKey(key[1])) {
                map.put(key[1], 2);
            } else {
                map.put(key[1], map.get(key[1]) + 1);
            }
        }

        for(String k : map.keySet()) {
            answer = answer * map.get(k);
        }

        return answer - 1;
    }
}
